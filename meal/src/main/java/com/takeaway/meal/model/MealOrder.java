package com.takeaway.meal.model;

import java.math.BigDecimal;
import java.util.Date;

public class MealOrder {
    private Integer orderId;

    private Integer discntId;

    private Integer orId;

    private Integer addrId;

    private Integer usrId;

    private Integer meaMerchantNum;

    private Integer riderNum;

    private BigDecimal initMoney;

    private BigDecimal finalMoney;

    private Date deliverTime;

    private String orderState;

    private Integer merchantNum;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getDiscntId() {
        return discntId;
    }

    public void setDiscntId(Integer discntId) {
        this.discntId = discntId;
    }

    public Integer getOrId() {
        return orId;
    }

    public void setOrId(Integer orId) {
        this.orId = orId;
    }

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public Integer getMeaMerchantNum() {
        return meaMerchantNum;
    }

    public void setMeaMerchantNum(Integer meaMerchantNum) {
        this.meaMerchantNum = meaMerchantNum;
    }

    public Integer getRiderNum() {
        return riderNum;
    }

    public void setRiderNum(Integer riderNum) {
        this.riderNum = riderNum;
    }

    public BigDecimal getInitMoney() {
        return initMoney;
    }

    public void setInitMoney(BigDecimal initMoney) {
        this.initMoney = initMoney;
    }

    public BigDecimal getFinalMoney() {
        return finalMoney;
    }

    public void setFinalMoney(BigDecimal finalMoney) {
        this.finalMoney = finalMoney;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    public Integer getMerchantNum() {
        return merchantNum;
    }

    public void setMerchantNum(Integer merchantNum) {
        this.merchantNum = merchantNum;
    }
}