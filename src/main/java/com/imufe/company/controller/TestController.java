package com.imufe.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @RequestMapping("/ccc")
    public String index(){
        return "admin/item/item";
    }

    @RequestMapping("/adminLogin")
    public String adminLogin(){return "admin/index";}
}
