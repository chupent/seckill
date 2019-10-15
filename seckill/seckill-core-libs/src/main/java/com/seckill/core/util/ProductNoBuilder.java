package com.seckill.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName ProductNoBuilder
 * @Description TODO
 * @createdate 2019/10/12 星期六 20:53
 */
public class ProductNoBuilder {
   public static String builder(){
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String key = "PRO"+simpleDateFormat.format(new Date());
        return  key.toUpperCase();
    }
}
