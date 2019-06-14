package com.imooc.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by MTL on 2019/6/13
 */
@ConfigurationProperties(prefix = "imooc.security")
public class SecurityProperties {

    private ValidateCodeProperties code = new ValidateCodeProperties();

    private BrowserProperties browser = new BrowserProperties();

    public ValidateCodeProperties getCode() {
        return code;
    }

    public void setCode(ValidateCodeProperties code) {
        this.code = code;
    }

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }
}
