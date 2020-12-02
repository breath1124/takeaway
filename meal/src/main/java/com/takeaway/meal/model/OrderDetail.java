package com.takeaway.meal.model;

import java.util.Date;

public class OrderDetail {
    private Integer orId;

    private Integer orderId;

    private Integer riderNum;

    private Long orNum;

    private Float orPrize;

    private Float orDiscount;

    private String riderevEva;

    private String riderevContent;

    private Date riderevTime;

    public Integer getOrId() {
        return orId;
    }

    public void setOrId(Integer orId) {
        this.orId = orId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getRiderNum() {
        return riderNum;
    }

    public void setRiderNum(Integer riderNum) {
        this.riderNum = riderNum;
    }

    public Long getOrNum() {
        return orNum;
    }

    public void setOrNum(Long orNum) {
        this.orNum = orNum;
    }

    public Float getOrPrize() {
        return orPrize;
    }

    public void setOrPrize(Float orPrize) {
        this.orPrize = orPrize;
    }

    public Float getOrDiscount() {
        return orDiscount;
    }

    public void setOrDiscount(Float orDiscount) {
        this.orDiscount = orDiscount;
    }

    public String getRiderevEva() {
        return riderevEva;
    }

    public void setRiderevEva(String riderevEva) {
        this.riderevEva = riderevEva == null ? null : riderevEva.trim();
    }

    public String getRiderevContent() {
        return riderevContent;
    }

    public void setRiderevContent(String riderevContent) {
        this.riderevContent = riderevContent == null ? null : riderevContent.trim();
    }

    public Date getRiderevTime() {
        return riderevTime;
    }

    public void setRiderevTime(Date riderevTime) {
        this.riderevTime = riderevTime;
    }
}