package com.imooc.security.core.properties;

/**
 * Created by MTL on 2019/6/13
 */
public class BrowserProperties {
    private String loginPage = "/login.html";

    private LoginResponseType loginType = LoginResponseType.JSON;

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
}

