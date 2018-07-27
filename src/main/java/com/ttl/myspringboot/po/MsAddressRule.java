package com.ttl.myspringboot.po;

public class MsAddressRule {
    private Integer id;

    private String addressName;

    private String addressDesc;

    private String upLeftLat;

    private String upLeftLng;

    private String upRightLat;

    private String upRightLng;

    private String belowLeftLat;

    private String belowLeftLng;

    private String belowRightLat;

    private String belowRightLng;

    private Byte isAvailable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }

    public String getAddressDesc() {
        return addressDesc;
    }

    public void setAddressDesc(String addressDesc) {
        this.addressDesc = addressDesc == null ? null : addressDesc.trim();
    }

    public String getUpLeftLat() {
        return upLeftLat;
    }

    public void setUpLeftLat(String upLeftLat) {
        this.upLeftLat = upLeftLat == null ? null : upLeftLat.trim();
    }

    public String getUpLeftLng() {
        return upLeftLng;
    }

    public void setUpLeftLng(String upLeftLng) {
        this.upLeftLng = upLeftLng == null ? null : upLeftLng.trim();
    }

    public String getUpRightLat() {
        return upRightLat;
    }

    public void setUpRightLat(String upRightLat) {
        this.upRightLat = upRightLat == null ? null : upRightLat.trim();
    }

    public String getUpRightLng() {
        return upRightLng;
    }

    public void setUpRightLng(String upRightLng) {
        this.upRightLng = upRightLng == null ? null : upRightLng.trim();
    }

    public String getBelowLeftLat() {
        return belowLeftLat;
    }

    public void setBelowLeftLat(String belowLeftLat) {
        this.belowLeftLat = belowLeftLat == null ? null : belowLeftLat.trim();
    }

    public String getBelowLeftLng() {
        return belowLeftLng;
    }

    public void setBelowLeftLng(String belowLeftLng) {
        this.belowLeftLng = belowLeftLng == null ? null : belowLeftLng.trim();
    }

    public String getBelowRightLat() {
        return belowRightLat;
    }

    public void setBelowRightLat(String belowRightLat) {
        this.belowRightLat = belowRightLat == null ? null : belowRightLat.trim();
    }

    public String getBelowRightLng() {
        return belowRightLng;
    }

    public void setBelowRightLng(String belowRightLng) {
        this.belowRightLng = belowRightLng == null ? null : belowRightLng.trim();
    }

    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }
}