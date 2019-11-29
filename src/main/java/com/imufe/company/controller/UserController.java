package com.imufe.company.controller;


import com.imufe.company.dto.UserDto;
import com.imufe.company.entity.User;
import com.imufe.company.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("用户")
@RestController
@RequestMapping("/UserController")
public class UserController {


    @Autowired
    UserService userService;

    @ApiOperation(value = "查询监管用户")
    @PostMapping("/selectUserBySecDep")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public List<UserDto> selectUserBySecDep(){
        return userService.selectUserBySecDep();
    }

    @ApiOperation(value = "查询公司用户")
    @PostMapping("/selectUserByCompany")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public List<UserDto> selectUserByCompany(){
        return userService.selectUserByCompany();
    }

    @ApiOperation(value = "查询特定公司用户")
    @GetMapping("/selectUserByCompanyId")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public User selectUserByCompanyId(@RequestParam("cId") Integer cId){
        return userService.selectUserByCompanyId(cId);
    }

    @ApiOperation(value = "查询特定监管用户")
    @GetMapping("/selectUserBySecDepId")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public User selectUserBySecDepId(@RequestParam("sId") Integer sId){
        return userService.selectUserBySecDepId(sId);
    }

    @ApiOperation(value = "更新用户")
    @PostMapping("/updateByPrimaryKeySelective")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public String updateByPrimaryKeySelective(@RequestBody User user){
        return userService.updateByPrimaryKeySelective(user);
    }
}
