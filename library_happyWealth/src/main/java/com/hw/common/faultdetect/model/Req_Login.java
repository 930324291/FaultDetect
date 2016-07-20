package com.hw.common.faultdetect.model;

/**
 * Created by nicai on 2016/7/18.
 */
public class Req_Login {
    private String userInput; // 手机号
    private String pwd; // 密码

    public Req_Login(String userInput, String pwd) {
        this.userInput = userInput;
        this.pwd = pwd;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
