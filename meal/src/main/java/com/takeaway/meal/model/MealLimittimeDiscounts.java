package com.takeaway.meal.model;

import java.math.BigDecimal;
import java.util.Date;

public class MealLimittimeDiscounts {
    private Integer promotionId;

    private Integer goodsId;

    private BigDecimal promotionPrice;

    private Integer promotionCnt;

    private Date promotionBegin;

    private Date promotionEnd;

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Integer getPromotionCnt() {
        return promotionCnt;
    }

    public void setPromotionCnt(Integer promotionCnt) {
        this.promotionCnt = promotionCnt;
    }

    public Date getPromotionBegin() {
        return promotionBegin;
    }

    public void setPromotionBegin(Date promotionBegin) {
        this.promotionBegin = promotionBegin;
    }

    public Date getPromotionEnd() {
        return promotionEnd;
    }

    public void setPromotionEnd(Date promotionEnd) {
        this.promotionEnd = promotionEnd;
    }
}