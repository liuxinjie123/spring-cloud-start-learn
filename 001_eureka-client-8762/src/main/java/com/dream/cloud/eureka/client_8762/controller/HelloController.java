package com.dream.cloud.eureka.client_8762.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello SpringCloud, I am from port:" + port + ", name=" + name;
    }


}
