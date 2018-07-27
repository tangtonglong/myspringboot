package com.ttl.myspringboot.po;

import java.util.Date;

public class MsAppoint {
    private Integer id;

    private Integer projectId;

    private String appointTitle;

    private Integer peopleNum;

    private String welfareList;

    private Integer vocationId;

    private String payDesc;

    private Integer characterId;

    private Integer userId;

    private Date startDate;

    private Date endDate;

    private Date createTime;

    private Date updateTime;

    private Byte appointStatus;

    private String appointDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getAppointTitle() {
        return appointTitle;
    }

    public void setAppointTitle(String appointTitle) {
        this.appointTitle = appointTitle == null ? null : appointTitle.trim();
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getWelfareList() {
        return welfareList;
    }

    public void setWelfareList(String welfareList) {
        this.welfareList = welfareList == null ? null : welfareList.trim();
    }

    public Integer getVocationId() {
        return vocationId;
    }

    public void setVocationId(Integer vocationId) {
        this.vocationId = vocationId;
    }

    public String getPayDesc() {
        return payDesc;
    }

    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc == null ? null : payDesc.trim();
    }

    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getAppointStatus() {
        return appointStatus;
    }

    public void setAppointStatus(Byte appointStatus) {
        this.appointStatus = appointStatus;
    }

    public String getAppointDesc() {
        return appointDesc;
    }

    public void setAppointDesc(String appointDesc) {
        this.appointDesc = appointDesc == null ? null : appointDesc.trim();
    }
}