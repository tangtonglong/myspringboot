package com.ttl.myspringboot.po;

import java.util.Date;

public class MsUserRetroactive {
    private Integer id;

    private Integer userId;

    private Integer groupId;

    private Integer projectId;

    private String retroactiveReason;

    private String retroactiveDesc;

    private Date retroactiveDate;

    private Date retroactiveTime;

    private String attachUrl;

    private String photoUrl;

    private Byte isAvailable;

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

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getRetroactiveReason() {
        return retroactiveReason;
    }

    public void setRetroactiveReason(String retroactiveReason) {
        this.retroactiveReason = retroactiveReason == null ? null : retroactiveReason.trim();
    }

    public String getRetroactiveDesc() {
        return retroactiveDesc;
    }

    public void setRetroactiveDesc(String retroactiveDesc) {
        this.retroactiveDesc = retroactiveDesc == null ? null : retroactiveDesc.trim();
    }

    public Date getRetroactiveDate() {
        return retroactiveDate;
    }

    public void setRetroactiveDate(Date retroactiveDate) {
        this.retroactiveDate = retroactiveDate;
    }

    public Date getRetroactiveTime() {
        return retroactiveTime;
    }

    public void setRetroactiveTime(Date retroactiveTime) {
        this.retroactiveTime = retroactiveTime;
    }

    public String getAttachUrl() {
        return attachUrl;
    }

    public void setAttachUrl(String attachUrl) {
        this.attachUrl = attachUrl == null ? null : attachUrl.trim();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }
}