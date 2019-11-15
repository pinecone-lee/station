package com.example.feign.controller;

import com.example.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/")
    public String login(){
        return userService.login();
    }

    @RequestMapping("/log")
    public String do_login(@RequestParam String id,@RequestParam String pwd){
        return userService.do_login(id,pwd);
    }
}
