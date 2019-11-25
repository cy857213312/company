package com.imufe.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class companyController {
    @RequestMapping("/")
    public String adminLogin(){return "gov/login";}
}

