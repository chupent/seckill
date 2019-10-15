package com.seckill.core;

import com.seckill.core.pojo.Product;
import com.seckill.core.service.ProductService;
import com.seckill.core.util.ProductNoBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName SeckillWebServiceSpringApplication
 * @Description TODO
 * @createdate 2019/10/12 星期六 20:43
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SeckillWebServiceSpringApplicationTest {
    @Autowired
    ProductService productService;
    @Test
    public void test(){
        Product product = new Product();
        String key = ProductNoBuilder.builder();
        System.out.println(key);
        product.setProductNo(key);
        product.setType("办公");
        product.setProductPrice(34.1);
        product.setProductName("订书机");
        productService.insertProduct(product);
    }
}
