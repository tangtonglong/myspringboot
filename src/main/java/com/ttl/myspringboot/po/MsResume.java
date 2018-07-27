package com.ttl.myspringboot.po;

import java.util.Date;

public class MsResume {
    private Integer id;

    private Integer userId;

    private Integer vocationId;

    private Integer workAge;

    private Integer liveinId;

    private String phone;

    private Integer jobFeatureId;

    private Integer expectWorkDistrictId;

    private String expectSalary;

    private String workApplyStatus;

    private Byte isDefault;

    private Byte resumeStatus;

    private String resumeName;

    private Date createTime;

    private Integer industryId;

    private String selfEval;

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

    public Integer getVocationId() {
        return vocationId;
    }

    public void setVocationId(Integer vocationId) {
        this.vocationId = vocationId;
    }

    public Integer getWorkAge() {
        return workAge;
    }

    public void setWorkAge(Integer workAge) {
        this.workAge = workAge;
    }

    public Integer getLiveinId() {
        return liveinId;
    }

    public void setLiveinId(Integer liveinId) {
        this.liveinId = liveinId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getJobFeatureId() {
        return jobFeatureId;
    }

    public void setJobFeatureId(Integer jobFeatureId) {
        this.jobFeatureId = jobFeatureId;
    }

    public Integer getExpectWorkDistrictId() {
        return expectWorkDistrictId;
    }

    public void setExpectWorkDistrictId(Integer expectWorkDistrictId) {
        this.expectWorkDistrictId = expectWorkDistrictId;
    }

    public String getExpectSalary() {
        return expectSalary;
    }

    public void setExpectSalary(String expectSalary) {
        this.expectSalary = expectSalary == null ? null : expectSalary.trim();
    }

    public String getWorkApplyStatus() {
        return workApplyStatus;
    }

    public void setWorkApplyStatus(String workApplyStatus) {
        this.workApplyStatus = workApplyStatus == null ? null : workApplyStatus.trim();
    }

    public Byte getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

    public Byte getResumeStatus() {
        return resumeStatus;
    }

    public void setResumeStatus(Byte resumeStatus) {
        this.resumeStatus = resumeStatus;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName == null ? null : resumeName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    public String getSelfEval() {
        return selfEval;
    }

    public void setSelfEval(String selfEval) {
        this.selfEval = selfEval == null ? null : selfEval.trim();
    }
}