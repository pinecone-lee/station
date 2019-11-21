package com.example.feign.config;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GobalErrorHandler implements ErrorController {
    private static final String ERROR_PATH="/error";

    @RequestMapping("/expire")
    public String expire(){
        return "expire";
    }

    @RequestMapping(value = ERROR_PATH)
    public String handleError(){
        return "error";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
