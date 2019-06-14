package com.imooc.security.core.validate.code;

import com.imooc.security.core.validate.code.image.ImageCode;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * Created by MTL on 2019/6/14
 */
public interface ValidateCodeGenerator {
    ImageCode createCode(ServletWebRequest request);
}
