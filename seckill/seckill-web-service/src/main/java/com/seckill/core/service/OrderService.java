package com.seckill.core.service;

import com.seckill.core.amqp.msg.OrderMessage;
import com.seckill.core.pojo.Order;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName OrderService
 * @Description TODO
 * @createdate 2019/10/13 星期日 19:37
 */
public interface OrderService {
    boolean orderCommit(OrderMessage message);
    Order queryOrderByNo(String orderNo);
}
