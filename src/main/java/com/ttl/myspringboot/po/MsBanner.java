package com.ttl.myspringboot.po;

public class MsBanner {
    private Integer id;

    private Integer bannerPicId;

    private Byte bannerIndex;

    private String bannerDesc;

    private Byte bannerType;

    private String bannerUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBannerPicId() {
        return bannerPicId;
    }

    public void setBannerPicId(Integer bannerPicId) {
        this.bannerPicId = bannerPicId;
    }

    public Byte getBannerIndex() {
        return bannerIndex;
    }

    public void setBannerIndex(Byte bannerIndex) {
        this.bannerIndex = bannerIndex;
    }

    public String getBannerDesc() {
        return bannerDesc;
    }

    public void setBannerDesc(String bannerDesc) {
        this.bannerDesc = bannerDesc == null ? null : bannerDesc.trim();
    }

    public Byte getBannerType() {
        return bannerType;
    }

    public void setBannerType(Byte bannerType) {
        this.bannerType = bannerType;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
    }
}