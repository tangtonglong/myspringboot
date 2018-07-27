package com.ttl.myspringboot.po;

public class MsFlowDetail {
    private Integer flowId;

    private Integer flowOrder;

    private Integer flowRoleId;

    private Integer duration;

    private Byte isApproval;

    private String remindId;

    private Byte whereabouts;

    private Integer thirdFunctionId;

    private Byte isAttach;

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

    public Integer getFlowRoleId() {
        return flowRoleId;
    }

    public void setFlowRoleId(Integer flowRoleId) {
        this.flowRoleId = flowRoleId;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Byte getIsApproval() {
        return isApproval;
    }

    public void setIsApproval(Byte isApproval) {
        this.isApproval = isApproval;
    }

    public String getRemindId() {
        return remindId;
    }

    public void setRemindId(String remindId) {
        this.remindId = remindId == null ? null : remindId.trim();
    }

    public Byte getWhereabouts() {
        return whereabouts;
    }

    public void setWhereabouts(Byte whereabouts) {
        this.whereabouts = whereabouts;
    }

    public Integer getThirdFunctionId() {
        return thirdFunctionId;
    }

    public void setThirdFunctionId(Integer thirdFunctionId) {
        this.thirdFunctionId = thirdFunctionId;
    }

    public Byte getIsAttach() {
        return isAttach;
    }

    public void setIsAttach(Byte isAttach) {
        this.isAttach = isAttach;
    }
}