package com.ttl.myspringboot.po;

public class MsFunc {
    private Integer id;

    private String funcName;

    private String funcUrl;

    private Byte funcStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

    public String getFuncUrl() {
        return funcUrl;
    }

    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl == null ? null : funcUrl.trim();
    }

    public Byte getFuncStatus() {
        return funcStatus;
    }

    public void setFuncStatus(Byte funcStatus) {
        this.funcStatus = funcStatus;
    }
}