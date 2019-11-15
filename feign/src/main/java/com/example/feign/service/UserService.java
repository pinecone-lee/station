package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@FeignClient(value = "user-client")
public interface UserService {
    @RequestMapping("/")
    String login();

    @RequestMapping("/log")
    String do_login(@RequestParam String id,@RequestParam String pwd);
}
