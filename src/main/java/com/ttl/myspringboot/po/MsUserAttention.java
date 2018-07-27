package com.ttl.myspringboot.po;

public class MsUserAttention {
    private Integer userId;

    private String districtIdList;

    private String vocationIdList;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDistrictIdList() {
        return districtIdList;
    }

    public void setDistrictIdList(String districtIdList) {
        this.districtIdList = districtIdList == null ? null : districtIdList.trim();
    }

    public String getVocationIdList() {
        return vocationIdList;
    }

    public void setVocationIdList(String vocationIdList) {
        this.vocationIdList = vocationIdList == null ? null : vocationIdList.trim();
    }
}