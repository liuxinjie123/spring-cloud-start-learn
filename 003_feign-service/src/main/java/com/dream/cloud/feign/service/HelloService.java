package com.dream.cloud.feign.service;

import com.dream.cloud.feign.service.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-service", fallback = HelloServiceImpl.class)
public interface HelloService {

    @GetMapping(value = "/hello")
    String hello(@RequestParam("name") String name);

}
