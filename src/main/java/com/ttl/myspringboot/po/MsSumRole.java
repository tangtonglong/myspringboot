package com.ttl.myspringboot.po;

public class MsSumRole {
    private Integer sumRoleId;

    private String sumRoleName;

    private String sumRoleDesc;

    private Integer sumRoleType;

    private Integer sumRoleApp;

    private Byte sumRoleStatus;

    public Integer getSumRoleId() {
        return sumRoleId;
    }

    public void setSumRoleId(Integer sumRoleId) {
        this.sumRoleId = sumRoleId;
    }

    public String getSumRoleName() {
        return sumRoleName;
    }

    public void setSumRoleName(String sumRoleName) {
        this.sumRoleName = sumRoleName == null ? null : sumRoleName.trim();
    }

    public String getSumRoleDesc() {
        return sumRoleDesc;
    }

    public void setSumRoleDesc(String sumRoleDesc) {
        this.sumRoleDesc = sumRoleDesc == null ? null : sumRoleDesc.trim();
    }

    public Integer getSumRoleType() {
        return sumRoleType;
    }

    public void setSumRoleType(Integer sumRoleType) {
        this.sumRoleType = sumRoleType;
    }

    public Integer getSumRoleApp() {
        return sumRoleApp;
    }

    public void setSumRoleApp(Integer sumRoleApp) {
        this.sumRoleApp = sumRoleApp;
    }

    public Byte getSumRoleStatus() {
        return sumRoleStatus;
    }

    public void setSumRoleStatus(Byte sumRoleStatus) {
        this.sumRoleStatus = sumRoleStatus;
    }
}