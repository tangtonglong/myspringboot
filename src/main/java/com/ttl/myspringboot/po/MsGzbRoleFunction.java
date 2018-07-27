package com.ttl.myspringboot.po;

public class MsGzbRoleFunction {
    private Integer id;

    private String gzbRoleName;

    private String gzbRoleDesc;

    private String gzbFuncList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGzbRoleName() {
        return gzbRoleName;
    }

    public void setGzbRoleName(String gzbRoleName) {
        this.gzbRoleName = gzbRoleName == null ? null : gzbRoleName.trim();
    }

    public String getGzbRoleDesc() {
        return gzbRoleDesc;
    }

    public void setGzbRoleDesc(String gzbRoleDesc) {
        this.gzbRoleDesc = gzbRoleDesc == null ? null : gzbRoleDesc.trim();
    }

    public String getGzbFuncList() {
        return gzbFuncList;
    }

    public void setGzbFuncList(String gzbFuncList) {
        this.gzbFuncList = gzbFuncList == null ? null : gzbFuncList.trim();
    }
}