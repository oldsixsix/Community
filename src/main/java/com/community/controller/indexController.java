package com.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

//   启动项目首页跳转到index
    @GetMapping("/")
    public String startIndex(){
        return "index";
    }
}
