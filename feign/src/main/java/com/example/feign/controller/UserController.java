package com.example.feign.controller;

import com.example.common.util.CookieUtils;
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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String login(HttpServletRequest request){
        String token = CookieUtils.getCookieValue(request,"station_token");
        return userService.login(token);
    }

    @RequestMapping("/reg")
    public String register(){
        return userService.register();
    }

    @RequestMapping("/reg.check")
    public String register_check(@RequestParam String name,@RequestParam String sex,@RequestParam String pw,@RequestParam String account,@RequestParam String phone,@RequestParam String idc,@RequestParam String check){
        return userService.register_check(name, sex, pw, account, phone, idc, check);
    }

    @RequestMapping("/log")
    public String do_login(@RequestParam String account, @RequestParam String pwd,HttpServletRequest request,HttpServletResponse response) throws InterruptedException {
        String token = UUID.randomUUID().toString();
        CookieUtils.setCookie(request,response,"station_token",token);
        return userService.do_login(account,pwd,token);
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        String token = CookieUtils.getCookieValue(request,"station_token");
        return userService.logout(token);
    }
}
