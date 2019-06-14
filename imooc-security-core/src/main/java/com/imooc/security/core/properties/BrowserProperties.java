package com.imooc.security.core.properties;

/**
 * Created by MTL on 2019/6/13
 */
public class BrowserProperties {
    private String loginPage = "/login.html";

    private LoginResponseType loginType = LoginResponseType.JSON;

    private int rememberMeSeconds = 30;
//    private int rememberMeSeconds = 604800;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginResponseType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginResponseType loginType) {
        this.loginType = loginType;
    }

    public int getRememberMeSeconds() {
        return rememberMeSeconds;
    }

    public void setRememberMeSeconds(int rememberMeSeconds) {
        this.rememberMeSeconds = rememberMeSeconds;
    }
}

