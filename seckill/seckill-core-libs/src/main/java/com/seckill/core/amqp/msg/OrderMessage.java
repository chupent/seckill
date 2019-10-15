package com.seckill.core.amqp.msg;

import java.util.List;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName OrederMessage
 * @Description TODO
 * @createdate 2019/10/13 星期日 18:04
 */
public class OrderMessage extends Message {
    private String userId;//用户
    private String orderNo;//订单编号
    private String productNos;//选中商品

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProductNos() {
        return productNos;
    }

    public void setProductNos(String productNos) {
        this.productNos = productNos;
    }

    @Override
    public String toString() {
        return "OrderMessage{" +
                "userId='" + userId + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", productNos=" + productNos +
                '}';
    }
}
