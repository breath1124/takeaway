package com.takeaway.meal.model;

import java.util.Date;

public class MealUsr {
    private Integer usrId;

    private String usrName;

    private String usrSex;

    private String usrPwd;

    private String usrTel;

    private String usrEmail;

    private String usrCity;

    private Date usrRegistertime;

    private String usrIsvip;

    private Date usrVipddl;

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName == null ? null : usrName.trim();
    }

    public String getUsrSex() {
        return usrSex;
    }

    public void setUsrSex(String usrSex) {
        this.usrSex = usrSex == null ? null : usrSex.trim();
    }

    public String getUsrPwd() {
        return usrPwd;
    }

    public void setUsrPwd(String usrPwd) {
        this.usrPwd = usrPwd == null ? null : usrPwd.trim();
    }

    public String getUsrTel() {
        return usrTel;
    }

    public void setUsrTel(String usrTel) {
        this.usrTel = usrTel == null ? null : usrTel.trim();
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail == null ? null : usrEmail.trim();
    }

    public String getUsrCity() {
        return usrCity;
    }

    public void setUsrCity(String usrCity) {
        this.usrCity = usrCity == null ? null : usrCity.trim();
    }

    public Date getUsrRegistertime() {
        return usrRegistertime;
    }

    public void setUsrRegistertime(Date usrRegistertime) {
        this.usrRegistertime = usrRegistertime;
    }

    public String getUsrIsvip() {
        return usrIsvip;
    }

    public void setUsrIsvip(String usrIsvip) {
        this.usrIsvip = usrIsvip == null ? null : usrIsvip.trim();
    }

    public Date getUsrVipddl() {
        return usrVipddl;
    }

    public void setUsrVipddl(Date usrVipddl) {
        this.usrVipddl = usrVipddl;
    }
}