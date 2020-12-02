package com.takeaway.meal.model;

public class MealDeliveryman {
    private Integer riderNum;

    private String riderName;

    private String riderSex;

    private Integer riderAge;

    private String riderAccount;

    private String riderPwd;

    public Integer getRiderNum() {
        return riderNum;
    }

    public void setRiderNum(Integer riderNum) {
        this.riderNum = riderNum;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName == null ? null : riderName.trim();
    }

    public String getRiderSex() {
        return riderSex;
    }

    public void setRiderSex(String riderSex) {
        this.riderSex = riderSex == null ? null : riderSex.trim();
    }

    public Integer getRiderAge() {
        return riderAge;
    }

    public void setRiderAge(Integer riderAge) {
        this.riderAge = riderAge;
    }

    public String getRiderAccount() {
        return riderAccount;
    }

    public void setRiderAccount(String riderAccount) {
        this.riderAccount = riderAccount == null ? null : riderAccount.trim();
    }

    public String getRiderPwd() {
        return riderPwd;
    }

    public void setRiderPwd(String riderPwd) {
        this.riderPwd = riderPwd == null ? null : riderPwd.trim();
    }
}