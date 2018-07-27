package com.ttl.myspringboot.po;

import java.util.Date;

public class MsFlowDetailRecord {
    private Integer id;

    private Integer flowId;

    private Integer flowOrder;

    private Integer userId;

    private String remark;

    private Byte detailStatus;

    private Date createTime;

    private Date deadTime;

    private Integer flowRecordId;

    private String attachUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public Integer getFlowOrder() {
        return flowOrder;
    }

    public void setFlowOrder(Integer flowOrder) {
        this.flowOrder = flowOrder;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(Byte detailStatus) {
        this.detailStatus = detailStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDeadTime() {
        return deadTime;
    }

    public void setDeadTime(Date deadTime) {
        this.deadTime = deadTime;
    }

    public Integer getFlowRecordId() {
        return flowRecordId;
    }

    public void setFlowRecordId(Integer flowRecordId) {
        this.flowRecordId = flowRecordId;
    }

    public String getAttachUrl() {
        return attachUrl;
    }

    public void setAttachUrl(String attachUrl) {
        this.attachUrl = attachUrl == null ? null : attachUrl.trim();
    }
}