package com.hw.common.faultdetect.model;

/**
 * Created by nicai on 2016/7/20.
 * email：930324291@qq.com
 */
public class UserInfo{
    private String userid;
    private String userName;
    private String nickName;
    private String account;
    private String tel;
    private String email;
    private String xb;
    private String organizationId;
    private String rsid;
    private Res_Company belongedOrganizations;

    public String getRsid() {
        return rsid;
    }

    public void setRsid(String rsid) {
        this.rsid = rsid;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public Res_Company getBelongedOrganizations() {
        return belongedOrganizations;
    }

    public void setBelongedOrganizations(Res_Company belongedOrganizations) {
        this.belongedOrganizations = belongedOrganizations;
    }
}
