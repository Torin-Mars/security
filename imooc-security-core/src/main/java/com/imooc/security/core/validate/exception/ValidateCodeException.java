package com.imooc.security.core.validate.exception;


import org.springframework.security.core.AuthenticationException;

/**
 * Created by MTL on 2019/6/14
 */
public class ValidateCodeException extends AuthenticationException {

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
