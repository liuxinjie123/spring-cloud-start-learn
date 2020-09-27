package com.dream.cloud.feign.service.impl;

import com.dream.cloud.feign.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "sorry, " + name;
    }

}
