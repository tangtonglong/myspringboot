package com.ttl.myspringboot.po;

import java.util.Date;

public class MsTaskRule {
    private Integer id;

    private Integer projectId;

    private Integer vocationId;

    private Integer totalNum;

    private Date startDate;

    private Date endDate;

    private Byte taskRuleStatus;

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

    public Integer getVocationId() {
        return vocationId;
    }

    public void setVocationId(Integer vocationId) {
        this.vocationId = vocationId;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
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

    public Byte getTaskRuleStatus() {
        return taskRuleStatus;
    }

    public void setTaskRuleStatus(Byte taskRuleStatus) {
        this.taskRuleStatus = taskRuleStatus;
    }
}