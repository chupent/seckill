package com.seckill.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName OrderNoBuilder
 * @Description TODO
 * @createdate 2019/10/13 星期日 17:41
 */
public class OrderNoBuilder {
    public static String builder(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String key = "OER"+simpleDateFormat.format(new Date());
        return  key.toUpperCase();
    }
}
