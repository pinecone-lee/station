package com.example.fileclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.example")
@MapperScan("com.example.common.mapper")
@EnableEurekaClient
public class FileclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileclientApplication.class, args);
    }

}
