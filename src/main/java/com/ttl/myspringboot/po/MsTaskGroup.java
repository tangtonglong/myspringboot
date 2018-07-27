package com.ttl.myspringboot.po;

public class MsTaskGroup {
    private Integer id;

    private Integer taskRuleId;

    private Integer groupId;

    private Byte relStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskRuleId() {
        return taskRuleId;
    }

    public void setTaskRuleId(Integer taskRuleId) {
        this.taskRuleId = taskRuleId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Byte getRelStatus() {
        return relStatus;
    }

    public void setRelStatus(Byte relStatus) {
        this.relStatus = relStatus;
    }
}