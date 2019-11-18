package com.imufe.company.controller;


import com.imufe.company.entity.GraSubsidiary;
import com.imufe.company.entity.GraSubsidiaryRules;
import com.imufe.company.service.GraSubsidiaryRulesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "单元明细条例")
@RestController
@RequestMapping("/GraSubsidiaryController")
public class GraSubsidiaryRulesController {

    @Autowired
    GraSubsidiaryRulesService graSubsidiaryRulesService;

    @ApiOperation(value = "查询所有单元明细条例")
    @GetMapping("/selectAllGraSubsidiaryRules")
    public List<GraSubsidiaryRules> selectAllGraSubsidiaryRules(@RequestParam("graSuId") Integer graSuId){
        return graSubsidiaryRulesService.selectAllGraSubsidiaryRules(graSuId);
    }
}
