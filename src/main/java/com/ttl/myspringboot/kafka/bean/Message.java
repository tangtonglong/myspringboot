package com.ttl.myspringboot.kafka.bean;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Tangtl
 * @program: myspringboot
 * @Package com.ttl.myspringboot.po.message
 * @Title: Message
 * @Description:
 * @date 2018-08-10  17:20
 */
@Data
public class Message {
    /**
     *
     */
    private Long id;

    /**
     *  消息
     */
    private String msg;

    /**
     * 时间戳
     */
    private LocalDateTime sendTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }
}
