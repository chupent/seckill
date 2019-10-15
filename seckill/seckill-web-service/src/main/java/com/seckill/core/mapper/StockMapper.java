package com.seckill.core.mapper;

import com.seckill.core.pojo.Stock;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName StockMapper
 * @Description TODO
 * @createdate 2019/10/12 星期六 21:09
 */
@Mapper
public interface StockMapper {
    List<Stock> queryStocks();
    Stock queryStock(String productId);
    int updateStock(Stock stock);
}
