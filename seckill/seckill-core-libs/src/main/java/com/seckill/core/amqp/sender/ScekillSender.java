package com.seckill.core.amqp.sender;

import com.seckill.core.amqp.msg.Message;
import com.seckill.core.amqp.msg.OrderMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName ScekillSender
 * @Description TODO 秒杀消息生产者
 * @createdate 2019/10/12 星期六 21:21
 */
public class ScekillSender {

    private static  final Logger LOGGER = LoggerFactory.getLogger(ScekillSender.class);

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Qualifier("seckillQueue")
    @Autowired
    private  Queue queue;

    public void sendStringMessage(OrderMessage message){
        LOGGER.debug(" [x] Sent '" + message+ "' to"+ queue.getName());
        rabbitTemplate.convertAndSend(queue.getName(),message);
    }

}
