package com.dream.cloud.ribbon.service.impl;

import com.dream.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 在这里我们直接用的程序名替代了具体的url地址，
     * 在ribbon中它会根据服务名来选择具体的服务实例，
     * 根据服务实例在请求的时候会用具体的url替换掉服务名
     */
    @Override
    public String hello(String name) {
        Map<String, String> params = new HashMap<>();
        params.put("name", name);
        return restTemplate.getForObject("http://EUREKASERVICE/hello?name={name}", String.class, params);
    }
}
