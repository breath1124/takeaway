package com.takeaway.meal.model;

public class MealMerchant {
    private Integer merchantNum;

    private String merchantName;

    private String merchantDescribe;

    private String merchantAccount;

    private String merchantPwd;

    private Integer merchantOrder;

    public Integer getMerchantNum() {
        return merchantNum;
    }

    public void setMerchantNum(Integer merchantNum) {
        this.merchantNum = merchantNum;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantDescribe() {
        return merchantDescribe;
    }

    public void setMerchantDescribe(String merchantDescribe) {
        this.merchantDescribe = merchantDescribe == null ? null : merchantDescribe.trim();
    }

    public String getMerchantAccount() {
        return merchantAccount;
    }

    public void setMerchantAccount(String merchantAccount) {
        this.merchantAccount = merchantAccount == null ? null : merchantAccount.trim();
    }

    public String getMerchantPwd() {
        return merchantPwd;
    }

    public void setMerchantPwd(String merchantPwd) {
        this.merchantPwd = merchantPwd == null ? null : merchantPwd.trim();
    }

    public Integer getMerchantOrder() {
        return merchantOrder;
    }

    public void setMerchantOrder(Integer merchantOrder) {
        this.merchantOrder = merchantOrder;
    }
}