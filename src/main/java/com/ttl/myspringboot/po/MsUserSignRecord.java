package com.ttl.myspringboot.po;

import java.util.Date;

public class MsUserSignRecord {
    private Integer id;

    private Integer userId;

    private Integer groupId;

    private Integer projectId;

    private Date signDate;

    private Date signInTime1;

    private Date signOutTime1;

    private String signInAdd1;

    private String signInLat1;

    private String signInLng1;

    private String signOutAdd1;

    private String signOutLat1;

    private String signOutLng1;

    private Date signInTime2;

    private Date signOutTime2;

    private String signInAdd2;

    private String signInLat2;

    private String signInLng2;

    private String signOutAdd2;

    private String signOutLat2;

    private String signOutLng2;

    private Integer strategyId;

    private Byte signInType1;

    private Byte signOutType1;

    private Byte signInType2;

    private Byte signOutType2;

    private Byte fullAttendance;

    private Byte checkIn;

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

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Date getSignInTime1() {
        return signInTime1;
    }

    public void setSignInTime1(Date signInTime1) {
        this.signInTime1 = signInTime1;
    }

    public Date getSignOutTime1() {
        return signOutTime1;
    }

    public void setSignOutTime1(Date signOutTime1) {
        this.signOutTime1 = signOutTime1;
    }

    public String getSignInAdd1() {
        return signInAdd1;
    }

    public void setSignInAdd1(String signInAdd1) {
        this.signInAdd1 = signInAdd1 == null ? null : signInAdd1.trim();
    }

    public String getSignInLat1() {
        return signInLat1;
    }

    public void setSignInLat1(String signInLat1) {
        this.signInLat1 = signInLat1 == null ? null : signInLat1.trim();
    }

    public String getSignInLng1() {
        return signInLng1;
    }

    public void setSignInLng1(String signInLng1) {
        this.signInLng1 = signInLng1 == null ? null : signInLng1.trim();
    }

    public String getSignOutAdd1() {
        return signOutAdd1;
    }

    public void setSignOutAdd1(String signOutAdd1) {
        this.signOutAdd1 = signOutAdd1 == null ? null : signOutAdd1.trim();
    }

    public String getSignOutLat1() {
        return signOutLat1;
    }

    public void setSignOutLat1(String signOutLat1) {
        this.signOutLat1 = signOutLat1 == null ? null : signOutLat1.trim();
    }

    public String getSignOutLng1() {
        return signOutLng1;
    }

    public void setSignOutLng1(String signOutLng1) {
        this.signOutLng1 = signOutLng1 == null ? null : signOutLng1.trim();
    }

    public Date getSignInTime2() {
        return signInTime2;
    }

    public void setSignInTime2(Date signInTime2) {
        this.signInTime2 = signInTime2;
    }

    public Date getSignOutTime2() {
        return signOutTime2;
    }

    public void setSignOutTime2(Date signOutTime2) {
        this.signOutTime2 = signOutTime2;
    }

    public String getSignInAdd2() {
        return signInAdd2;
    }

    public void setSignInAdd2(String signInAdd2) {
        this.signInAdd2 = signInAdd2 == null ? null : signInAdd2.trim();
    }

    public String getSignInLat2() {
        return signInLat2;
    }

    public void setSignInLat2(String signInLat2) {
        this.signInLat2 = signInLat2 == null ? null : signInLat2.trim();
    }

    public String getSignInLng2() {
        return signInLng2;
    }

    public void setSignInLng2(String signInLng2) {
        this.signInLng2 = signInLng2 == null ? null : signInLng2.trim();
    }

    public String getSignOutAdd2() {
        return signOutAdd2;
    }

    public void setSignOutAdd2(String signOutAdd2) {
        this.signOutAdd2 = signOutAdd2 == null ? null : signOutAdd2.trim();
    }

    public String getSignOutLat2() {
        return signOutLat2;
    }

    public void setSignOutLat2(String signOutLat2) {
        this.signOutLat2 = signOutLat2 == null ? null : signOutLat2.trim();
    }

    public String getSignOutLng2() {
        return signOutLng2;
    }

    public void setSignOutLng2(String signOutLng2) {
        this.signOutLng2 = signOutLng2 == null ? null : signOutLng2.trim();
    }

    public Integer getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
    }

    public Byte getSignInType1() {
        return signInType1;
    }

    public void setSignInType1(Byte signInType1) {
        this.signInType1 = signInType1;
    }

    public Byte getSignOutType1() {
        return signOutType1;
    }

    public void setSignOutType1(Byte signOutType1) {
        this.signOutType1 = signOutType1;
    }

    public Byte getSignInType2() {
        return signInType2;
    }

    public void setSignInType2(Byte signInType2) {
        this.signInType2 = signInType2;
    }

    public Byte getSignOutType2() {
        return signOutType2;
    }

    public void setSignOutType2(Byte signOutType2) {
        this.signOutType2 = signOutType2;
    }

    public Byte getFullAttendance() {
        return fullAttendance;
    }

    public void setFullAttendance(Byte fullAttendance) {
        this.fullAttendance = fullAttendance;
    }

    public Byte getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Byte checkIn) {
        this.checkIn = checkIn;
    }

    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }
}