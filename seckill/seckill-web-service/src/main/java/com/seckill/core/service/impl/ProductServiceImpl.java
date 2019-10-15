package com.seckill.core.service.impl;
import com.seckill.core.mapper.ProductMapper;
import com.seckill.core.pojo.Product;
import com.seckill.core.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author chupengtang
 * @version 1.0
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @createdate 2019/10/12 星期六 20:46
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    protected ProductMapper productMapper;
    @Override
    public int insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }


}
