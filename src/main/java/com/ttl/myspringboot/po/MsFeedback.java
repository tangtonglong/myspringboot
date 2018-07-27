package com.ttl.myspringboot.po;

import java.util.Date;

public class MsFeedback {
    private Integer id;

    private Integer userId;

    private Date feedbackTime;

    private Byte feedbackType;

    private Byte feedbackPriority;

    private Byte feedbackStatus;

    private String feedbackContent;

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

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public Byte getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(Byte feedbackType) {
        this.feedbackType = feedbackType;
    }

    public Byte getFeedbackPriority() {
        return feedbackPriority;
    }

    public void setFeedbackPriority(Byte feedbackPriority) {
        this.feedbackPriority = feedbackPriority;
    }

    public Byte getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(Byte feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent == null ? null : feedbackContent.trim();
    }
}