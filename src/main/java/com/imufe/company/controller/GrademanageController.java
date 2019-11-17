package com.imufe.company.controller;

import com.imufe.company.entity.Grademanage;
import com.imufe.company.service.GrademanageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/GrademanageController")
public class GrademanageController {


    @Autowired
    GrademanageService grademanageService;


    @GetMapping("/selectAllGrade")
    public List<Grademanage> selectAllGrade(){
        return grademanageService.selectAllGrade();
    }


}
