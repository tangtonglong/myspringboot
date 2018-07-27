package com.ttl.myspringboot.po;

import java.util.Date;

public class MsProjectGroup {
    private Integer id;

    private Integer groupId;

    private Integer projectId;

    private Date startDate;

    private Date endDate;

    private Byte evalLevel;

    private Byte relStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Byte getEvalLevel() {
        return evalLevel;
    }

    public void setEvalLevel(Byte evalLevel) {
        this.evalLevel = evalLevel;
    }

    public Byte getRelStatus() {
        return relStatus;
    }

    public void setRelStatus(Byte relStatus) {
        this.relStatus = relStatus;
    }
}