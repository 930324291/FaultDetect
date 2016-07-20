package com.hw.common.faultdetect.api;

import com.hw.common.faultdetect.model.BaseAjaxCallBack;
import com.hw.common.faultdetect.model.Req_Login;
import com.hw.common.faultdetect.model.Req_Regist;
import com.hw.common.faultdetect.model.Req_UpdatePwd;
import com.hw.common.faultdetect.model.UserInfo;
import com.hw.common.web.FastHttp;

/**
 * Created by nicai on 2016/7/20.
 * email：930324291@qq.com
 */
public class UserServiceApi {
    private static final String SERVER_URL = "http://121.40.142.156:8080/failcoop/";

    /*注册接口*/
    public static void registApi(Req_Regist req_regist, BaseAjaxCallBack baseAjaxCallBack){
        FastHttp.ajaxGetByBean(SERVER_URL + "register/register.html", req_regist, baseAjaxCallBack);
    }

    /*发送手机验证码*/
    public static void sendVerCode(String tel, BaseAjaxCallBack baseAjaxCallBack){
        FastHttp.ajaxGetByBean(SERVER_URL + "register/sendCode.html?tel="+tel, null, baseAjaxCallBack);
    }

    /*获取用户注册帮助信息
    * rdid 设备编号
    * */
    public static void getRegistHelpInfo(String rdid, BaseAjaxCallBack baseAjaxCallBack){
        FastHttp.ajaxGetByBean(SERVER_URL + "register/getRegisterHelpInfo.html?rdid="+rdid, null, baseAjaxCallBack);
    }

    /*登录接口*/
    public static void loginApi(Req_Login req_login, BaseAjaxCallBack baseAjaxCallBack){
        FastHttp.ajaxGetByBean(SERVER_URL + "login.html", req_login, baseAjaxCallBack);
    }

    /*获取用户信息*/
    public static void getUserInfo(String userid, BaseAjaxCallBack baseAjaxCallBack){
        FastHttp.ajaxGetByBean(SERVER_URL + "register/GetRegisterInfomation.html?userid="+userid, null, baseAjaxCallBack);
    }

    /*修改用户信息*/
    public static void setUserInfo(UserInfo userInfo, BaseAjaxCallBack baseAjaxCallBack){
        FastHttp.ajaxGetByBean(SERVER_URL + "register/modify.html", userInfo, baseAjaxCallBack);
    }

    /*忘记密码*/
    public static void setPwd(Req_UpdatePwd req_updatePwd, BaseAjaxCallBack baseAjaxCallBack){
        FastHttp.ajaxGetByBean(SERVER_URL + "register/modifyPassword.html", req_updatePwd, baseAjaxCallBack);
    }
}
