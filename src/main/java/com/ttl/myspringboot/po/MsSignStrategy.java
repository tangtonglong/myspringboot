package com.ttl.myspringboot.po;

public class MsSignStrategy {
    private Integer id;

    private Integer timeRuleId;

    private String addressRuleList;

    private Byte isAvailable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTimeRuleId() {
        return timeRuleId;
    }

    public void setTimeRuleId(Integer timeRuleId) {
        this.timeRuleId = timeRuleId;
    }

    public String getAddressRuleList() {
        return addressRuleList;
    }

    public void setAddressRuleList(String addressRuleList) {
        this.addressRuleList = addressRuleList == null ? null : addressRuleList.trim();
    }

    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }
}