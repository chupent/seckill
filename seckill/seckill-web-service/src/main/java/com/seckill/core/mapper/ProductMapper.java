package com.seckill.core.mapper;

import com.seckill.core.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName ProductMapper
 * @Description TODO
 * @createdate 2019/10/12 星期六 20:25
 */
@Mapper
public interface ProductMapper {
    int insertProduct(@Param("product") Product product);
}
