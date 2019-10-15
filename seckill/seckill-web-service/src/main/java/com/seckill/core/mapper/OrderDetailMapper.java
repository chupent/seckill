package com.seckill.core.mapper;

import com.seckill.core.pojo.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName OrderDetailMapper
 * @Description TODO
 * @createdate 2019/10/13 星期日 17:42
 */
@Mapper
public interface OrderDetailMapper {
    int insertOrderDetail(OrderDetail detail);
}
