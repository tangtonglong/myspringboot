package com.ttl.myspringboot.po;

public class MsRegister {
    private Integer id;

    private String phone;

    private Byte registerStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Byte getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(Byte registerStatus) {
        this.registerStatus = registerStatus;
    }
}