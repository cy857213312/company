package com.imufe.company.controller;

import com.imufe.company.entity.Company;
import com.imufe.company.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("公司")
@RestController
@RequestMapping("/CompanyController")
public class CompanyController {


    @Autowired
    CompanyService companyService;

    @ApiOperation(value = "查询所有公司")
    @GetMapping("/selectAllCompany")
    public List<Company> selectAllCompany(){
        return companyService.selectAllCompany();
    }

    @ApiOperation(value = "增加公司")
    @PostMapping("/insertCompany")
    public String insertCompany(@RequestBody Company company){
        return companyService.insertCompany(company);
    }

    @ApiOperation(value = "删除公司")
    @PostMapping("/deleteCompany")
    public String deleteCompany(@RequestParam("id") Integer id){
        return companyService.deleteCompany(id);
    }

    @ApiOperation(value = "更改公司信息")
    @PostMapping("/updateCompany")
    public String updateCompany(@RequestBody Company company){
        return companyService.updateCompany(company);
    }

    @ApiOperation(value = "查找单独公司信息")
    @PostMapping("/selectSingleCompany")
    public Company selectSingleCompany(@RequestParam("id") Integer id){
        return companyService.selectSingleCompany(id);
    }




}
