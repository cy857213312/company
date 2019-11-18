package com.imufe.company.controller;

import com.imufe.company.entity.GraSubsidiary;
import com.imufe.company.service.GraSubsidiaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "单元明细")
@RestController
@RequestMapping("/GraSubsidiaryController")
public class GraSubsidiaryController {

    @Autowired
    GraSubsidiaryService graSubsidiaryService;

    @ApiOperation(value = "增加单元明细")
    @PostMapping("/insertGraSubsidiary")
    public boolean insertGraSubsidiary(@RequestBody  GraSubsidiary graSubsidiary){
        return graSubsidiaryService.insertGraSubsidiary(graSubsidiary);
    }

    @ApiOperation(value = "查询该公司所有单元明细")
    @GetMapping("/selectAllGraSubsidiary")
    public List<GraSubsidiary> selectAllGraSubsidiary(@RequestParam("gId") Integer gId){
        return graSubsidiaryService.selectAllGraSubsidiary(gId);
    }

    @ApiOperation(value = "查询单个单元明细")
    @GetMapping("/selectByPrimaryKey")
    public GraSubsidiary selectByPrimaryKey(@RequestParam("id") Integer id){
        return graSubsidiaryService.selectByPrimaryKey(id);
    }

    @ApiOperation(value = "更新单个单元明细")
    @PostMapping("/updateByPrimaryKeySelective")
    public Boolean updateByPrimaryKeySelective(@RequestBody GraSubsidiary graSubsidiary){
        return graSubsidiaryService.updateByPrimaryKeySelective(graSubsidiary);
    }
}
