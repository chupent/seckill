package com.seckill.core.amqp.receiver;

import com.seckill.core.amqp.AmqpConstant;
import com.seckill.core.amqp.msg.OrderMessage;
import com.seckill.core.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @author chupengtang
 * @version 1.0
 * @ClassName ScekillRecevicer
 * @Description TODO 秒杀消息消费者
 * @createdate 2019/10/12 星期六 21:34
 */
@RabbitListener(queues = AmqpConstant.QUEUE_SECKIIL)
@Component
public class ScekillReceiver {
    private static final  Logger LOGGER = LoggerFactory.getLogger(ScekillReceiver.class);

    @Autowired
    OrderService orderService;


//    选择秒杀商品==>进入商品详情==>点击购买商品==判断库存==>库存扣减===>生成预订单、订单明细==>  ==>支付成功===>订单成功
        //                                                                              ==>支付失败===>订单失败==>库存还原
        //                                                                              ==>支付超时===>订单失败==>库存还原

    /**
     *
     *   提交订单=>将商品信息、订单号、用户信息封装为消息=>发送MQ队列==>响应订单号给前端==>请求结束
     *   前端接到订单号延迟3~4s,根据订单号向服务端发起查看是否下单成功==>校验订单成功==>进入支付页==>支付成功==>订单生效
     *                                                                                 ==>支付失败==>库存回滚
     *                                                                                 ==>支付超时==>库存回滚(批处理回滚)
     *
     *   队列消费者==>接到消息==>获取商品信息==>库存满足==>扣减库存==>生成订单、订单明细==>处理结束
     *                                   ==>库存不足==>处理结束
     *
     *
     */




    @RabbitHandler
    public void recevie(OrderMessage message){//处理String消息
        LOGGER.info(message.toString());
        boolean bol = orderService.orderCommit(message);
        if(bol){
            LOGGER.info("下单成功!");
        }
    }
}
