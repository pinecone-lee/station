package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "buy-client")
public interface BuyService {
    @RequestMapping("/user/buy")
    String buy(@RequestParam String token);

    @RequestMapping("/user/confirm")
    String confirm(@RequestParam String train,@RequestParam String style,@RequestParam String ticket,@RequestParam String token);

    @RequestMapping("/user/buying")
    String buying(@RequestParam String train,@RequestParam String style,@RequestParam String ticket,@RequestParam String token);

}
