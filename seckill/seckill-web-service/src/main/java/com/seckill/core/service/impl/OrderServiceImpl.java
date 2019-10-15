package com.seckill.core.service.impl;

import com.seckill.core.amqp.msg.OrderMessage;
import com.seckill.core.mapper.OrderDetailMapper;
import com.seckill.core.mapper.OrderMapper;
import com.seckill.core.mapper.StockMapper;
import com.seckill.core.pojo.Order;
import com.seckill.core.pojo.OrderDetail;
import com.seckill.core.pojo.Stock;
import com.seckill.core.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @createdate 2019/10/13 星期日 19:37
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private StockMapper stockMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean orderCommit(OrderMessage message) {
        //查看库存
        Stock stock = stockMapper.queryStock(message.getProductNos());
        if (null==stock||stock.getStockSale()>=stock.getStockCount()){
            System.out.println("库存不足");
            return false;
        }
        try {
            int updateStock = stockMapper.updateStock(stock); //扣减库存
            if(updateStock==1){
                //生成订单记录
                Order order = new Order();
                order.setOrderNo(message.getOrderNo());
                order.setUserId(message.getUserId());
                order.setIsValid(0);
                int insertOrder = orderMapper.insertOrder(order);

                if(insertOrder==1){  //生成订单明细记录
                    OrderDetail detail = new OrderDetail();
                    detail.setOrderNo(message.getOrderNo());
                    detail.setProductCount(1);
                    detail.setProductPrice(101.1);
                    detail.setProductId(message.getProductNos());
                    detail.setUserId(message.getUserId());
                    detail.setOrderDetailNo("DET123456789");
                    orderDetailMapper.insertOrderDetail(detail);
                }
            }
        }catch (Exception e){
            System.out.println("订单失败!");
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//事务回滚
            return false;
        }
        return true;
    }

    @Override
    public Order queryOrderByNo(String orderNo) {
        Order order = orderMapper.queryOrderByNo(orderNo);
        return order;
    }


}
