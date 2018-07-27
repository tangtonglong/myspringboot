package com.ttl.myspringboot.po;

import java.util.Date;

public class MsUserLackAttendance {
    private Integer id;

    private Integer userId;

    private Integer groupId;

    private Integer projectId;

    private Date recordDate;

    private Date lackTime1;

    private Date lackTime2;

    private Byte recordType;

    private Integer strategyId;

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

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Date getLackTime1() {
        return lackTime1;
    }

    public void setLackTime1(Date lackTime1) {
        this.lackTime1 = lackTime1;
    }

    public Date getLackTime2() {
        return lackTime2;
    }

    public void setLackTime2(Date lackTime2) {
        this.lackTime2 = lackTime2;
    }

    public Byte getRecordType() {
        return recordType;
    }

    public void setRecordType(Byte recordType) {
        this.recordType = recordType;
    }

    public Integer getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
    }

    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }
}