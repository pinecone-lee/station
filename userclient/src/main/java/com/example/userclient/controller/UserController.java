package com.example.userclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/user")
    @ResponseBody
    public String user(@RequestParam(value = "str",defaultValue = "qdd") String str){
//        ModelAndView mv = new ModelAndView("index");
//        mv.addObject("str",str);
        return str;
    }

}
