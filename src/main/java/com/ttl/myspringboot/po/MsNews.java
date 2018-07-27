package com.ttl.myspringboot.po;

import java.util.Date;

public class MsNews {
    private Integer id;

    private String title;

    private String subtitle;

    private Date createTime;

    private Byte navType;

    private Byte secondType;

    private Byte isImg;

    private String picUrl;

    private Integer vocationId;

    private Integer districtId;

    private String newFrom;

    private String newsUrl;

    private Byte isCollect;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getNavType() {
        return navType;
    }

    public void setNavType(Byte navType) {
        this.navType = navType;
    }

    public Byte getSecondType() {
        return secondType;
    }

    public void setSecondType(Byte secondType) {
        this.secondType = secondType;
    }

    public Byte getIsImg() {
        return isImg;
    }

    public void setIsImg(Byte isImg) {
        this.isImg = isImg;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getVocationId() {
        return vocationId;
    }

    public void setVocationId(Integer vocationId) {
        this.vocationId = vocationId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getNewFrom() {
        return newFrom;
    }

    public void setNewFrom(String newFrom) {
        this.newFrom = newFrom == null ? null : newFrom.trim();
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl == null ? null : newsUrl.trim();
    }

    public Byte getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(Byte isCollect) {
        this.isCollect = isCollect;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}