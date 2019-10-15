package com.seckill.core;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName SeckillWebClientSpringApplication
 * @Description TODO
 * @createdate 2019/10/12 星期六 21:55
 */
@SpringBootApplication
@EnableRabbit
public class SeckillWebClientSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeckillWebClientSpringApplication.class,args);
    }
}
