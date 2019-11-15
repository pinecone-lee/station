package com.example.userclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example")
@MapperScan("com.example.common.mapper")
@EnableEurekaClient
public class UserclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserclientApplication.class, args);
    }

}
