package com.ttl.myspringboot.po;

public class MsUserCompany {
    private Integer userId;

    private Integer companyId;

    private Byte relStatus;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Byte getRelStatus() {
        return relStatus;
    }

    public void setRelStatus(Byte relStatus) {
        this.relStatus = relStatus;
    }
}