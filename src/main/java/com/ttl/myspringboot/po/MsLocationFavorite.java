package com.ttl.myspringboot.po;

import java.util.Date;

public class MsLocationFavorite {
    private Integer id;

    private Integer userId;

    private String lat;

    private String lng;

    private String address;

    private Byte favoriteType;

    private String favoriteLabel;

    private Date createTime;

    private Byte isAvailable;

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

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(Byte favoriteType) {
        this.favoriteType = favoriteType;
    }

    public String getFavoriteLabel() {
        return favoriteLabel;
    }

    public void setFavoriteLabel(String favoriteLabel) {
        this.favoriteLabel = favoriteLabel == null ? null : favoriteLabel.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }
}