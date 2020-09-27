package com.dream.cloud.ribbon2.controller;

import com.dream.cloud.ribbon2.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping
    public String hello(@RequestParam(value = "name") String name) {
        return helloService.hello(name);
    }



}
