package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "pwd-client")
public interface PwdService {
    @RequestMapping("/user/pwd")
    String pwd();

    @RequestMapping("/user/pwd.save")
    String pwd_save(@RequestParam String token,@RequestParam String pw,@RequestParam String pw1);
}
