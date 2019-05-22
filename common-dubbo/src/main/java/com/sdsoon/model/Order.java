package com.sdsoon.model;

import java.io.Serializable;

/**
 * Created By Chr on 2019/3/9/0009.
 */
public class Order  implements Serializable{

    private static final long serialVersionUID = 4360131992417723940L;
    private Integer orderId;
    private Double price;
    private String addr;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", price=" + price +
                ", addr='" + addr + '\'' +
                '}';
    }
}
