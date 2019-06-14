package com.imooc.service.impl;

import com.imooc.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by MTL on 2019/6/13
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String greeting(String tom) {
        System.out.println("hello" + tom);
        return "";
    }
}
