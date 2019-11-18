package com.example.feign.controller;

import com.example.common.util.CookieUtils;
import com.example.feign.service.FileService;
import com.example.feign.service.PwdService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class PwdController {
    @Resource
    private PwdService pwdService;

    @RequestMapping("/user/pwd")
    public String pwd(){
        return pwdService.pwd();
    }

    @RequestMapping("/user/pwd.save")
    public String pwd_save(@RequestParam String pw,@RequestParam String pw1, HttpServletRequest request){
        String token = CookieUtils.getCookieValue(request,"station_token");
        return pwdService.pwd_save(token,pw,pw1);
    }
}
