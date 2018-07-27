package com.ttl.myspringboot.po;

public class MsFlowRole {
    private Integer id;

    private Integer flowId;

    private Integer allotId;

    private Byte allotType;

    private Byte isAvailable;

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

    public Integer getAllotId() {
        return allotId;
    }

    public void setAllotId(Integer allotId) {
        this.allotId = allotId;
    }

    public Byte getAllotType() {
        return allotType;
    }

    public void setAllotType(Byte allotType) {
        this.allotType = allotType;
    }

    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }
}