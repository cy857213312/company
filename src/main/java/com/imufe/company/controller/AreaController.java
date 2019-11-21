package com.imufe.company.controller;

import com.imufe.company.entity.Area;
import com.imufe.company.service.AreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("区域管理")
@RestController
public class AreaController {

    @Autowired
    AreaService areaService;

    @ApiOperation(value = "查询所有区域")
    @PostMapping("/selectAllArea")
    public List<Area> selectAllArea(){
        return areaService.selectAllArea();
    }

    @ApiOperation(value = "增加区域")
    @PostMapping("/insertArea")
    public String insertArea(@RequestBody  Area area){
        return areaService.insertArea(area);
    }

    @ApiOperation(value = "删除区域")
    @PostMapping("/deleteArea")
    public String deleteArea(@RequestParam("id") Integer id){
        return areaService.deleteArea(id);
    }

    @ApiOperation(value = "更新区域")
    @PostMapping("/updateArea")
    public String updateArea(@RequestBody Area area){
        return areaService.updateArea(area);
    }

    @ApiOperation(value = "查询单个区域")
    @PostMapping("/selectSingleArea")
    public Area selectSingleArea(@RequestParam("id") Integer id){
        return areaService.selectSingleArea(id);
    }
}
