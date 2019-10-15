package com.seckill.core.pojo;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName Order
 * @Description TODO 订单
 * @createdate 2019/10/13 星期日 13:20
 */
public class Order {
    private String orderNo;
    private String userId;
    private int isValid;
    private String create_time;
    private String payTime;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getIsValid() {
        return isValid;
    }

    public void setIsValid(int isValid) {
        this.isValid = isValid;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }
}
