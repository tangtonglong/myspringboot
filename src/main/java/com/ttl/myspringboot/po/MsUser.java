package com.ttl.myspringboot.po;

import java.io.Serializable;
import java.util.Date;

public class MsUser implements Serializable {
    private static final long serialVersionUID = -1L;

    private Integer id;

    private String phone;

    private String password;

    private String userName;

    private String idNo;

    private Date birth;

    private Byte sex;

    private Integer age;

    private Integer workAge;

    private Integer height;

    private Integer weight;

    private String photoUrl;

    private Integer gzbRoleId;

    private Integer districtId;

    private Integer liveinId;

    private String address;

    private Integer vocationId;

    private Integer workDistrictId;

    private Integer regDistrictId;

    private Date createTime;

    private Byte userStatus;

    private String mail;

    private String virMail;

    private Integer starLevel;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWorkAge() {
        return workAge;
    }

    public void setWorkAge(Integer workAge) {
        this.workAge = workAge;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public Integer getGzbRoleId() {
        return gzbRoleId;
    }

    public void setGzbRoleId(Integer gzbRoleId) {
        this.gzbRoleId = gzbRoleId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getLiveinId() {
        return liveinId;
    }

    public void setLiveinId(Integer liveinId) {
        this.liveinId = liveinId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getVocationId() {
        return vocationId;
    }

    public void setVocationId(Integer vocationId) {
        this.vocationId = vocationId;
    }

    public Integer getWorkDistrictId() {
        return workDistrictId;
    }

    public void setWorkDistrictId(Integer workDistrictId) {
        this.workDistrictId = workDistrictId;
    }

    public Integer getRegDistrictId() {
        return regDistrictId;
    }

    public void setRegDistrictId(Integer regDistrictId) {
        this.regDistrictId = regDistrictId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getVirMail() {
        return virMail;
    }

    public void setVirMail(String virMail) {
        this.virMail = virMail == null ? null : virMail.trim();
    }

    public Integer getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
    }
}