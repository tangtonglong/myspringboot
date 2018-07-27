package com.ttl.myspringboot.po;

import java.util.Date;

public class MsTimeRule {
    private Integer id;

    private String timeName;

    private String timeDesc;

    private Date signInTime1;

    private Integer signInBefore1;

    private Integer signInAfter1;

    private Date signOutTime1;

    private Integer signOutBefore1;

    private Integer signOutAfter1;

    private Date signInTime2;

    private Integer signInBefore2;

    private Integer signInAfter2;

    private Date signOutTime2;

    private Integer signOutBefore2;

    private Integer signOutAfter2;

    private Byte timeRuleType;

    private Byte isAvailable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimeName() {
        return timeName;
    }

    public void setTimeName(String timeName) {
        this.timeName = timeName == null ? null : timeName.trim();
    }

    public String getTimeDesc() {
        return timeDesc;
    }

    public void setTimeDesc(String timeDesc) {
        this.timeDesc = timeDesc == null ? null : timeDesc.trim();
    }

    public Date getSignInTime1() {
        return signInTime1;
    }

    public void setSignInTime1(Date signInTime1) {
        this.signInTime1 = signInTime1;
    }

    public Integer getSignInBefore1() {
        return signInBefore1;
    }

    public void setSignInBefore1(Integer signInBefore1) {
        this.signInBefore1 = signInBefore1;
    }

    public Integer getSignInAfter1() {
        return signInAfter1;
    }

    public void setSignInAfter1(Integer signInAfter1) {
        this.signInAfter1 = signInAfter1;
    }

    public Date getSignOutTime1() {
        return signOutTime1;
    }

    public void setSignOutTime1(Date signOutTime1) {
        this.signOutTime1 = signOutTime1;
    }

    public Integer getSignOutBefore1() {
        return signOutBefore1;
    }

    public void setSignOutBefore1(Integer signOutBefore1) {
        this.signOutBefore1 = signOutBefore1;
    }

    public Integer getSignOutAfter1() {
        return signOutAfter1;
    }

    public void setSignOutAfter1(Integer signOutAfter1) {
        this.signOutAfter1 = signOutAfter1;
    }

    public Date getSignInTime2() {
        return signInTime2;
    }

    public void setSignInTime2(Date signInTime2) {
        this.signInTime2 = signInTime2;
    }

    public Integer getSignInBefore2() {
        return signInBefore2;
    }

    public void setSignInBefore2(Integer signInBefore2) {
        this.signInBefore2 = signInBefore2;
    }

    public Integer getSignInAfter2() {
        return signInAfter2;
    }

    public void setSignInAfter2(Integer signInAfter2) {
        this.signInAfter2 = signInAfter2;
    }

    public Date getSignOutTime2() {
        return signOutTime2;
    }

    public void setSignOutTime2(Date signOutTime2) {
        this.signOutTime2 = signOutTime2;
    }

    public Integer getSignOutBefore2() {
        return signOutBefore2;
    }

    public void setSignOutBefore2(Integer signOutBefore2) {
        this.signOutBefore2 = signOutBefore2;
    }

    public Integer getSignOutAfter2() {
        return signOutAfter2;
    }

    public void setSignOutAfter2(Integer signOutAfter2) {
        this.signOutAfter2 = signOutAfter2;
    }

    public Byte getTimeRuleType() {
        return timeRuleType;
    }

    public void setTimeRuleType(Byte timeRuleType) {
        this.timeRuleType = timeRuleType;
    }

    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }
}