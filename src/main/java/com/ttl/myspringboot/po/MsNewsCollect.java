package com.ttl.myspringboot.po;

import java.util.Date;

public class MsNewsCollect {
    private Integer id;

    private Integer userId;

    private Integer newsId;

    private Byte navType;

    private String url;

    private String title;

    private String picture;

    private Date createTime;

    private Byte collectStatus;

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

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Byte getNavType() {
        return navType;
    }

    public void setNavType(Byte navType) {
        this.navType = navType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getCollectStatus() {
        return collectStatus;
    }

    public void setCollectStatus(Byte collectStatus) {
        this.collectStatus = collectStatus;
    }
}