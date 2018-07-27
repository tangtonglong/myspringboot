package com.ttl.myspringboot.po;

public class MsSquare {
    private Integer projectId;

    private String upLeftLat;

    private String upLeftLng;

    private String upRightLat;

    private String upRightLng;

    private String belowLeftLat;

    private String belowLeftLng;

    private String belowRightLat;

    private String belowRightLng;

    private Byte squareStatus;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
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

    public Byte getSquareStatus() {
        return squareStatus;
    }

    public void setSquareStatus(Byte squareStatus) {
        this.squareStatus = squareStatus;
    }
}