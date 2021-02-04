package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 主页面 on 2021/2/3 10:32
 */
@Controller

public class DashboardController {
    @GetMapping("/user/dashboard")
    public String Dash(){
        return "dashboard";
    }

    @GetMapping("/user/record1")
    public  String recodr1(){
        return  "record/record1";
    }

    @GetMapping("/user/mail")
    public  String mail(){
        return "mail";
    }

}
