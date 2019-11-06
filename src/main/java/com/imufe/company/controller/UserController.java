package com.imufe.company.controller;

import com.imufe.company.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserController")
public class UserController {


    @Autowired
    AreaService areaService;

    @PostMapping("/selectPos")
    public String selectPos(){

        System.out.println(areaService.selectPos().toArray().toString());
        return areaService.selectPos().toString();
    }

}

