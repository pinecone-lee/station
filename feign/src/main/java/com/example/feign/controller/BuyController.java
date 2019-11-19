package com.example.feign.controller;

import com.example.common.util.CookieUtils;
import com.example.feign.service.BuyService;
import com.example.feign.service.FileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class BuyController {
    @Resource
    private BuyService buyService;

    @RequestMapping("/user/buy")
    public String buy(HttpServletRequest request){
        String token = CookieUtils.getCookieValue(request,"station_token");
        return buyService.buy(token);
    }

    @RequestMapping("/user/confirm")
    public String confirm(@RequestParam String train,@RequestParam String style,@RequestParam String ticket,HttpServletRequest request){
        String token = CookieUtils.getCookieValue(request,"station_token");
        return buyService.confirm(train,style,ticket,token);
    }

    @RequestMapping("/user/buying")
    public String buying(@RequestParam String train,@RequestParam String style,@RequestParam String ticket,HttpServletRequest request){
        String token = CookieUtils.getCookieValue(request,"station_token");
        return buyService.buying(train,style,ticket,token);
    }
}
