package com.dream.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class HelloController {

    @Value("${foo}")
    String foo;

    @GetMapping(value = "/hello")
    public String hi(){
        return foo;
    }
}
