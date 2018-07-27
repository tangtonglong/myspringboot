package com.ttl.myspringboot.po;

import java.util.Date;

public class MsUserCard {
    private Integer id;

    private Integer userId;

    private String cardNo;

    private String cardType;

    private String bankName;

    private Byte cardStatus;

    private Date cardIndate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Byte getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(Byte cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Date getCardIndate() {
        return cardIndate;
    }

    public void setCardIndate(Date cardIndate) {
        this.cardIndate = cardIndate;
    }
}