package com.hotpot.entity;

public class OfferTrustList {
    private Integer offerId;

    private String userId;

    private Byte isTrust;

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Byte getIsTrust() {
        return isTrust;
    }

    public void setIsTrust(Byte isTrust) {
        this.isTrust = isTrust;
    }
}