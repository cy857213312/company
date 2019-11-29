package com.imufe.company.controller;

import com.imufe.company.dto.CompanyDto;
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
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public List<Company> selectAllCompany(){
        return companyService.selectAllCompany();
    }

    @ApiOperation(value = "增加公司")
    @PostMapping("/insertCompany")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public String insertCompany(@RequestBody Company company){
        return companyService.insertCompany(company);
    }

    @ApiOperation(value = "删除公司")
    @PostMapping("/deleteCompany")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public String deleteCompany(@RequestParam("id") Integer id){
        return companyService.deleteCompany(id);
    }

    @ApiOperation(value = "更改公司信息")
    @PostMapping("/updateCompany")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public String updateCompany(@RequestBody Company company){
        return companyService.updateCompany(company);
    }

    @ApiOperation(value = "查找单独公司信息")
    @GetMapping("/selectSingleCompany")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public CompanyDto selectSingleCompany(@RequestParam("id") Integer id){
        return companyService.selectCompanyDto(id);
    }




}
