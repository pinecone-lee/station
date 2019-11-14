package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@FeignClient(value = "user-client")
public interface UserService {
    @RequestMapping("/user")
    String user(@RequestParam(value = "str") String str);
}
