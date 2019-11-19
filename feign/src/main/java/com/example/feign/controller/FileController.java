package com.example.feign.controller;

import com.example.common.util.CookieUtils;
import com.example.feign.service.FileService;
import com.example.feign.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class FileController {
    @Resource
    private FileService fileService;

    @RequestMapping("/user/file")
    public String file(HttpServletRequest request){
        String token = CookieUtils.getCookieValue(request,"station_token");
        return fileService.file(token);
    }

    @RequestMapping("/user/file.save")
    public String file_save(@RequestParam String name, @RequestParam String sex, @RequestParam String account, @RequestParam String phone, @RequestParam String idc, HttpServletRequest request){
        String token = CookieUtils.getCookieValue(request,"station_token");
        return fileService.file_save(name,sex,account,phone,idc,token);
    }

}
