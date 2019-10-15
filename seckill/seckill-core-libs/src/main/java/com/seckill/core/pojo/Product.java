package com.seckill.core.pojo;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName Product
 * @Description TODO
 * @createdate 2019/10/12 星期六 20:15
 */
public class Product {
   private String productNo;
   private String productName;
   private double productPrice;
   private String type;
   private String createTime;

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
