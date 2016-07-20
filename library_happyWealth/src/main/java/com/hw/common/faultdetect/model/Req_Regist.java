package com.hw.common.faultdetect.model;

public class Req_Regist {
    private String tel; // 手机号
    private String jym; // 验证码
    private String pwd; // 密码

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Req_Regist(String tel, String pwd, String jym) {
        this.jym = jym;
        this.pwd = pwd;
        this.tel = tel;
    }

    public Req_Regist(){}
}
