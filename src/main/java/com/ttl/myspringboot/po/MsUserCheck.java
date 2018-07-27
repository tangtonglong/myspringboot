package com.ttl.myspringboot.po;

import java.util.Date;

public class MsUserCheck {
    private Integer id;

    private Integer userId;

    private String fileUrl;

    private Date applyTime;

    private Integer beforeRoleId;

    private Integer afterRoleId;

    private Date checkTime;

    private Byte checkStatus;

    private Byte checkResult;

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

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getBeforeRoleId() {
        return beforeRoleId;
    }

    public void setBeforeRoleId(Integer beforeRoleId) {
        this.beforeRoleId = beforeRoleId;
    }

    public Integer getAfterRoleId() {
        return afterRoleId;
    }

    public void setAfterRoleId(Integer afterRoleId) {
        this.afterRoleId = afterRoleId;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Byte getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Byte checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Byte getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Byte checkResult) {
        this.checkResult = checkResult;
    }
}