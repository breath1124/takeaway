package com.takeaway.meal.model;

import java.math.BigDecimal;
import java.util.Date;

public class MealDiscounts {
    private Integer discntId;

    private String discntDetail;

    private BigDecimal discntSuitmoney;

    private BigDecimal discntMinumoney;

    private Date discntBegin;

    private Date discntEnd;

    public Integer getDiscntId() {
        return discntId;
    }

    public void setDiscntId(Integer discntId) {
        this.discntId = discntId;
    }

    public String getDiscntDetail() {
        return discntDetail;
    }

    public void setDiscntDetail(String discntDetail) {
        this.discntDetail = discntDetail == null ? null : discntDetail.trim();
    }

    public BigDecimal getDiscntSuitmoney() {
        return discntSuitmoney;
    }

    public void setDiscntSuitmoney(BigDecimal discntSuitmoney) {
        this.discntSuitmoney = discntSuitmoney;
    }

    public BigDecimal getDiscntMinumoney() {
        return discntMinumoney;
    }

    public void setDiscntMinumoney(BigDecimal discntMinumoney) {
        this.discntMinumoney = discntMinumoney;
    }

    public Date getDiscntBegin() {
        return discntBegin;
    }

    public void setDiscntBegin(Date discntBegin) {
        this.discntBegin = discntBegin;
    }

    public Date getDiscntEnd() {
        return discntEnd;
    }

    public void setDiscntEnd(Date discntEnd) {
        this.discntEnd = discntEnd;
    }
}