package com.takeaway.meal.model;

import java.math.BigDecimal;
import java.util.Date;

public class Ridework extends RideworkKey {
    private Date rideraccountTime;

    private String rideraccountEva;

    private BigDecimal rideraccountPrize;

    public Date getRideraccountTime() {
        return rideraccountTime;
    }

    public void setRideraccountTime(Date rideraccountTime) {
        this.rideraccountTime = rideraccountTime;
    }

    public String getRideraccountEva() {
        return rideraccountEva;
    }

    public void setRideraccountEva(String rideraccountEva) {
        this.rideraccountEva = rideraccountEva == null ? null : rideraccountEva.trim();
    }

    public BigDecimal getRideraccountPrize() {
        return rideraccountPrize;
    }

    public void setRideraccountPrize(BigDecimal rideraccountPrize) {
        this.rideraccountPrize = rideraccountPrize;
    }
}