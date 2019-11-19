package com.example.userclient.controller;


import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String login(String token,Model model){
        if(token!=null){
            Jedis jedis = new Jedis("localhost");
            if(jedis.get(token)!=null){
                model.addAttribute("feign","/user/buy");
                return "feign";
            }
        }
        return "login";
    }

    @RequestMapping("/reg")
    public String register(){
        return "register";
    }

    @RequestMapping("/reg.check")
    public String reg_check(String name,String sex,String pwd,String account,String phone,String idc,String check,Model model){
        model.addAttribute("name",name);
        model.addAttribute("sex",sex);
        model.addAttribute("pwd",pwd);
        if(check.equals("1")){
            model.addAttribute("account",account);
            model.addAttribute("check",2);
            userService.addToRegister(name, sex, pwd, account, phone, idc);
        }
        else if(userService.checkToRegister(account,phone,idc)){
            model.addAttribute("check",1);
            model.addAttribute("account",account);
            model.addAttribute("phone",phone);
            model.addAttribute("idc",idc);
        }else {
            model.addAttribute("alert","<script>alert('账号/手机号/身份证号已注册')</script>");
        }
        return "/reg";
    }

    @RequestMapping("/log")
    public String do_login(String account, String pwd, Model model,String token){
        Integer id = userService.findToLogin(account,pwd);
        if(id!=-1) {
            Jedis jedis = new Jedis("localhost");
            jedis.set(token,String.valueOf(id));
            jedis.expire(token,3600);
            model.addAttribute("feign","/user/buy");
            return "feign";
        }
        model.addAttribute("alert","<script>alert('账号或密码错误')</script>");
        model.addAttribute("account",account);
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(String token){
        if(token!=null){
            Jedis jedis = new Jedis("localhost");
            jedis.del(token);
        }
        return "login";
    }
}
