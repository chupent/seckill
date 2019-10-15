package com.seckill.core.pojo;

/**
 * @author chupengtang
 * @version 1.0
 * @ClassName Scekill
 * @Description TODO
 * @createdate 2019/10/13 星期日 12:31
 */
public class Stock {
    private long stockId;
    private String productId;
    private String productName;
    private int stockCount;
    private int stockSale;
    private int stockVersion;

    public long getStockId() {
        return stockId;
    }

    public void setStockId(long stockId) {
        this.stockId = stockId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public int getStockSale() {
        return stockSale;
    }

    public void setStockSale(int stockSale) {
        this.stockSale = stockSale;
    }

    public int getStockVersion() {
        return stockVersion;
    }

    public void setStockVersion(int stockVersion) {
        this.stockVersion = stockVersion;
    }
}
