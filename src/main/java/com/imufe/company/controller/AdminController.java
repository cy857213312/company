package com.imufe.company.controller;


import com.imufe.company.entity.Admin;
import com.imufe.company.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/AdminController")
public class AdminController {


    @Autowired
    AdminService adminService;



    @PostMapping("/adminRegister")
    public String adminRegister(@RequestBody Admin admin){

        if(adminService.adminRegister(admin)){
            return "success";
        }else {
            return "false";
        }

    }

    @PostMapping("/adminLogin")
    public Admin adminLogin(@RequestBody Admin admin){
        return adminService.adminLogin(admin);
    }



}

