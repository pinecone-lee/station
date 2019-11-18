package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "file-client")
public interface FileService {
    @RequestMapping("/user/file")
    String file(@RequestParam String token);

    @RequestMapping("/user/file.save")
    String file_save(@RequestParam String name, @RequestParam String sex, @RequestParam String account, @RequestParam String phone, @RequestParam String idc, @RequestParam String token);

    @RequestMapping("/user/index")
    String index();
}
