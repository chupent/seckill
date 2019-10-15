package com.seckill.core.controller;

import com.seckill.core.amqp.msg.OrderMessage;
import com.seckill.core.amqp.sender.ScekillSender;
import com.seckill.core.util.OrderNoBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName TestController
 * @Description TODO
 * @createdate 2019/10/12 星期六 21:53
 */
@RestController
public class TestController {

    @Autowired
    ScekillSender scekillSender;

    @RequestMapping("testSend")
    public String testSend(){
        OrderMessage message = new OrderMessage();
        message.setOrderNo(OrderNoBuilder.builder());
        message.setProductNos("PRO20191012210634");
        message.setUserId("TANGCP");
        scekillSender.sendStringMessage(message);
        return message.getOrderNo();
    }
}
