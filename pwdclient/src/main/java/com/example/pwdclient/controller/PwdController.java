package com.example.pwdclient.controller;

import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

@Controller
public class PwdController {
    @Resource
    private UserService userService;

    @RequestMapping("/user/pwd")
    public String pwd(){
        return "pwd";
    }

    @RequestMapping("/user/pwd.save")
    public String pwd_save(String token, String pw,String pw1, Model model){
        Jedis jedis = new Jedis("localhost");
        Integer id = Integer.valueOf(jedis.get(token));
        if(userService.confirmPassword(id,pw)){
            userService.savePwd(id,pw1);
            model.addAttribute("alert","<script>alert('修改成功')</script>");
        }else {
            model.addAttribute("alert","<script>alert('旧密码不正确')</script>");
        }
        return "pwd";
    }
}
