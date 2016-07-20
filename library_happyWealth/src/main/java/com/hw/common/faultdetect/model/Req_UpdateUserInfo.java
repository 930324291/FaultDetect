package com.hw.common.faultdetect.model;

/**
 * Created by nicai on 2016/7/20.
 * email：930324291@qq.com
 */
public class Req_UpdateUserInfo{
    private String rdid;
    private String rsid;
    private String userid;
    private String userName;
    private String nickName;
    private String xb;
    private String organizationId;

    public Req_UpdateUserInfo(){}

    public Req_UpdateUserInfo(String userid) {
        this.userid = userid;
    }

    public String getRdid() {
        return rdid;
    }

    public void setRdid(String rdid) {
        this.rdid = rdid;
    }

    public String getRsid() {
        return rsid;
    }

    public void setRsid(String rsid) {
        this.rsid = rsid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}
