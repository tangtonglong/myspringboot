package com.ttl.myspringboot.po;

public class MsBin {
    private Integer id;

    private String bin;

    private String bankName;

    private String bankCode;

    private String cardName;

    private String cardType;

    private Integer cardNoLength;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin == null ? null : bin.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public Integer getCardNoLength() {
        return cardNoLength;
    }

    public void setCardNoLength(Integer cardNoLength) {
        this.cardNoLength = cardNoLength;
    }
}