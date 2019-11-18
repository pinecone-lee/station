package com.example.fileclient.controller;

import com.example.common.entity.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

@Controller
public class FileController {
    @Resource
    private UserService userService;

    @RequestMapping("/user/file")
    public String file(String token, Model model){
        Jedis jedis = new Jedis("localhost");
        User user = userService.findFile(Integer.valueOf(jedis.get(token)));
        model.addAttribute("user",user);
        return "file";
    }

    @RequestMapping("/user/file.save")
    public String file_save(String name,String sex, String account, String phone, String idc,String token, Model model){
        Jedis jedis = new Jedis("localhost");
        Integer id = Integer.valueOf(jedis.get(token));
        if(userService.checkToSave(id, account, phone, idc)){
            userService.saveFile(id,name,sex,account,phone,idc);
            model.addAttribute("alert","<script>alert('修改成功')</script>");
        }else {
            model.addAttribute("alert","<script>alert('修改失败：账号/手机号/身份证号已注册')</script>");
        }
        return "/user/file";
    }

    @RequestMapping("/user/index")
    public String index(){
        return "index";
    }
}
