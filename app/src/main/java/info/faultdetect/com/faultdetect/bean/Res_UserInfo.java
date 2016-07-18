package info.faultdetect.com.faultdetect.bean;

/**
 * Created by nicai on 2016/7/18.
 */
public class Res_UserInfo {
    private UserInfo userAccountDescriptor;

    public UserInfo getUserAccountDescriptor() {
        return userAccountDescriptor;
    }

    public void setUserAccountDescriptor(UserInfo userAccountDescriptor) {
        this.userAccountDescriptor = userAccountDescriptor;
    }

    public static class UserInfo {
        private String userid;
        private String userName;
        private String nickName;
        private String account;
        private String tel;
        private String email;
        private String organizationId;
        private String state;
        private String belongedOrganizations;

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

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getBelongedOrganizations() {
            return belongedOrganizations;
        }

        public void setBelongedOrganizations(String belongedOrganizations) {
            this.belongedOrganizations = belongedOrganizations;
        }
    }
}
