package com.imufe.company.controller;

import com.imufe.company.dto.PosDto;
import com.imufe.company.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/UserController")
public class UserController {


    @Autowired
    AreaService areaService;

    @PostMapping("/selectPos")
    public String selectPos(){

        List<PosDto> posDtos = areaService.selectPos();
        for (PosDto p:posDtos) {
            System.out.println(p.getAreaName());
        }

        return areaService.selectPos().toString();
    }

}

