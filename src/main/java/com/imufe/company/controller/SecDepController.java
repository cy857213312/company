package com.imufe.company.controller;

import com.imufe.company.entity.SecurityDepartment;
import com.imufe.company.service.SecDepService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("监管部门")
@RestController
@RequestMapping("/SecDepController")
public class SecDepController {

    @Autowired
    SecDepService secDepService;

    @ApiOperation(value = "增加监管部门")
    @PostMapping("/insertSecDep")
    public String insertSecDep(@RequestBody  SecurityDepartment securityDepartment){
        return secDepService.insertSecDep(securityDepartment);
    }

    @ApiOperation(value = "删除监管部门")
    @PostMapping("/deleteSecDep")
    public String deleteSecDep(@RequestParam("id") Integer id){
        return secDepService.deleteSecDep(id);
    }

    @ApiOperation(value = "更改监管部门")
    @PostMapping("/updateSecDep")
    public String updateSecDep(@RequestBody SecurityDepartment securityDepartment){
        return secDepService.updateSecDep(securityDepartment);
    }

    @ApiOperation(value = "查询单个监管部门")
    @PostMapping("/selectSingleSecDep")
    public SecurityDepartment selectSingleSecDep(@RequestParam("id") Integer id){
        return secDepService.selectSingleSecDep(id);
    }

    @ApiOperation(value = "查询所有监管部门")
    @PostMapping("/selectAllSecDep")
    public List<SecurityDepartment> selectAllSecDep(){
        return secDepService.selectAllSecDep();
    }


}
