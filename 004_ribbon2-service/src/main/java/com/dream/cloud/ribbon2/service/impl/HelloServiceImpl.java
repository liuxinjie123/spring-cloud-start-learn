package com.dream.cloud.ribbon2.service.impl;

import com.dream.cloud.ribbon2.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    RestTemplate restTemplate;
    @Value("${eureka.service.url}")
    private String eurekaServiceUrl;

    @HystrixCommand(fallbackMethod = "error")
    @Override
    public String hello(String name) {
        return restTemplate.getForObject(eurekaServiceUrl + "/hello?name=" + name, String.class);
    }

    public String error(String name) {
        return "hi, " + name + ", sorry, error!";
    }
}
