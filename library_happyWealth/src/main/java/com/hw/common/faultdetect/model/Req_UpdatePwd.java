package com.hw.common.faultdetect.model;

/**
 * Created by nicai on 2016/7/20.
 * email：930324291@qq.com
 */
public class Req_UpdatePwd{
    private String tel; // 手机号
    private String jym; // 验证码
    private String newPw; // 密码

    public Req_UpdatePwd(String tel, String newPw, String jym) {
        this.tel = tel;
        this.jym = jym;
        this.newPw = newPw;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym;
    }

    public String getNewPw() {
        return newPw;
    }

    public void setNewPw(String newPw) {
        this.newPw = newPw;
    }
}
