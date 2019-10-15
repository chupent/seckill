package com.seckill.core;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


/**
 * @author chupengtang
 * @version 1.0
 * @ClassName SeckillWebServiceSpringApplication
 * @Description TODO
 * @createdate 2019/10/12 星期六 20:21
 */
@SpringBootApplication
@EnableRabbit
@EnableCaching
public class SeckillWebServiceSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeckillWebServiceSpringApplication.class,args);
    }
}
