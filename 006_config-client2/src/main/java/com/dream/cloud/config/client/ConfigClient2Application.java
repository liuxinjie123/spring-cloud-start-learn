package com.dream.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient2Application.class, args);
    }


}
