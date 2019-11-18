package com.imufe.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/ccc")
    public String index(){
        return "gov/reg/check";
    }

    @RequestMapping("/adminLogin")
    public String adminLogin(){return "admin/index";}
}
