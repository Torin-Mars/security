package com.imooc.code;

import com.imooc.security.core.validate.code.ValidateCodeGenerator;
import com.imooc.security.core.validate.code.image.ImageCode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * Created by MTL on 2019/6/14
 */
//@Component("imageCodeGenerator")
public class DemoValidateCodeGenerator implements ValidateCodeGenerator {
    @Override
    public ImageCode createCode(ServletWebRequest request) {
        System.out.println("-------------------自定的生成器");
        return null;
    }
}
