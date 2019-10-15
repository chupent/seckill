package com.seckill.core.amqp.config;

import com.seckill.core.amqp.AmqpConstant;
import com.seckill.core.amqp.sender.ScekillSender;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName RabbitMqConfig
 * @Description TODO MQ队列配置中心，提供相应的策略加载MQ相关配置
 * @createdate 2019/10/12 星期六 21:13
 */
@Configuration
public class RabbitMqConfig {

    @Bean("seckillQueue")
    public Queue seckillQueue(){
        return new Queue(AmqpConstant.QUEUE_SECKIIL);
    }

    @Profile("sender")
    @Bean
    public ScekillSender scekillSender(){
        return new ScekillSender();
    }
}
