package com.example.userclient.controller;


import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String login(){
        return "index";
    }

    @RequestMapping("/log")
    public String do_login(String id,String pwd,Model model){
        boolean flag = userService.findToLogin(id,pwd);
        if(flag) return "show";
        model.addAttribute("alert","<script>alert('delay no more')</script>");
        return "index";
    }
}
