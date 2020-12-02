package com.takeaway.meal.model;

import java.util.Date;

public class MealRemark extends MealRemarkKey {
    private String remarkDetail;

    private Date remarkDate;

    private String remarkStar;

    private byte[] remarkPicture;

    public String getRemarkDetail() {
        return remarkDetail;
    }

    public void setRemarkDetail(String remarkDetail) {
        this.remarkDetail = remarkDetail == null ? null : remarkDetail.trim();
    }

    public Date getRemarkDate() {
        return remarkDate;
    }

    public void setRemarkDate(Date remarkDate) {
        this.remarkDate = remarkDate;
    }

    public String getRemarkStar() {
        return remarkStar;
    }

    public void setRemarkStar(String remarkStar) {
        this.remarkStar = remarkStar == null ? null : remarkStar.trim();
    }

    public byte[] getRemarkPicture() {
        return remarkPicture;
    }

    public void setRemarkPicture(byte[] remarkPicture) {
        this.remarkPicture = remarkPicture;
    }
}