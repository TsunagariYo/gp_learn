package com.edu.proxypattern.staticproxy;

/**
 * @ClassName Order
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 9:24
 */
public class Order {
    private Object orderInfo;
    private Long createTime;
    private String id;
    public Object getOrderInfo() {
        return orderInfo;
    }
    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }
    public Long getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
