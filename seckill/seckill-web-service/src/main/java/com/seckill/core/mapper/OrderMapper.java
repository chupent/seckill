package com.seckill.core.mapper;

import com.seckill.core.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName OrderMapper
 * @Description TODO
 * @createdate 2019/10/12 星期六 21:10
 */
@Mapper
public interface OrderMapper {
    Order queryOrderByNo(String orderNo);
    int insertOrder(Order order);
    int updateOrder(Order order);
}
