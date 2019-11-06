package com.imufe.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class TestController {

    @RequestMapping("/login")
    public String index(){
        return "admin/index";
    }
}
