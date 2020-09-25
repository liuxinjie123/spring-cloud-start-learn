package com.dream.cloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-service")
public interface HelloService {

    @GetMapping(value = "/hello")
    String hello(@RequestParam("name") String name);
}
