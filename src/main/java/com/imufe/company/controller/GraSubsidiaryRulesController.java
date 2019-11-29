package com.imufe.company.controller;


import com.imufe.company.entity.GraSubsidiary;
import com.imufe.company.entity.GraSubsidiaryRules;
import com.imufe.company.service.GraSubsidiaryRulesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.rmi.server.InactiveGroupException;

import java.util.List;

@Api(value = "单元明细条例")
@RestController
@RequestMapping("/GraSubsidiaryController")
public class GraSubsidiaryRulesController {

    @Autowired
    GraSubsidiaryRulesService graSubsidiaryRulesService;

    @ApiOperation(value = "查询所有单元明细条例")
    @GetMapping("/selectAllGraSubsidiaryRules")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public List<GraSubsidiaryRules> selectAllGraSubsidiaryRules(@RequestParam("graSuId") Integer graSuId){
        return graSubsidiaryRulesService.selectAllGraSubsidiaryRules(graSuId);
    }

    @ApiOperation(value = "查看单个单元明细条例")
    @GetMapping("/selectSingleGraSubRules")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public GraSubsidiaryRules selectSingleGraSubRules(@RequestParam("id") Integer id){
        return graSubsidiaryRulesService.selectSingleGraSubRules(id);
    }

    @ApiOperation(value = "增加单元明细条例")
    @PostMapping("/insertGraSubRules")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public String insertGraSubRules(@RequestBody GraSubsidiaryRules graSubsidiaryRules){
        return graSubsidiaryRulesService.insertGraSubRules(graSubsidiaryRules);
    }

    @ApiOperation(value = "更新单元明细条例")
    @PostMapping("/updateGraSubRules")
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
    public String updateGraSubRules(@RequestBody GraSubsidiaryRules graSubsidiaryRules){

        return graSubsidiaryRulesService.updateGraSubRules(graSubsidiaryRules);
    }
}
