package com.ttl.myspringboot.po;

public class MsTag {
    private Integer id;

    private String tagDesc;

    private Integer vocationId;

    private Byte tagStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagDesc() {
        return tagDesc;
    }

    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc == null ? null : tagDesc.trim();
    }

    public Integer getVocationId() {
        return vocationId;
    }

    public void setVocationId(Integer vocationId) {
        this.vocationId = vocationId;
    }

    public Byte getTagStatus() {
        return tagStatus;
    }

    public void setTagStatus(Byte tagStatus) {
        this.tagStatus = tagStatus;
    }
}