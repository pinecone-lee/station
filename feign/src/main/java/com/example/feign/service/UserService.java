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
    String login(@RequestParam String token);

    @RequestMapping("/reg")
    String register();

    @RequestMapping("/reg.check")
    String register_check(@RequestParam String name,@RequestParam String sex,@RequestParam String pwd,@RequestParam String account,@RequestParam String phone,@RequestParam String idc,@RequestParam String check);

    @RequestMapping("/log")
    String do_login(@RequestParam String account,@RequestParam String pwd,@RequestParam String token);

    @RequestMapping("/logout")
    String logout(@RequestParam String token);
}
