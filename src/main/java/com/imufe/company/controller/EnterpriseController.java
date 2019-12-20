package com.imufe.company.controller;

import com.imufe.company.dto.Detail;
import com.imufe.company.entity.Company;
import com.imufe.company.entity.SecurityCheck;
import com.imufe.company.mapper.CheckMapper;
import com.imufe.company.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class EnterpriseController {
    @Autowired
    CheckMapper checkMapper;
    @Autowired
    CompanyMapper companyMapper;
    //企业自查信息
    @GetMapping("/entData")
    public String data(){
        return "enterprise/ent/data";
    }

    @GetMapping("/hidden")
    public String check(Map<String,Object> map){
        //查看隐患信息
        final List<SecurityCheck> checks = checkMapper.getChecks();
        map.put("checks",checks);
        return "enterprise/ent/check";
    }
    @GetMapping("/toView/{id}")
    public String toView(@PathVariable("id") Integer id,Map<String,Object> map){
        //查看详细信息
        final Detail detail = checkMapper.selectByPrimaryKey(id);
        map.put("detail",detail);
        return"enterprise/ent/view";
    }
    @GetMapping("/toAdd")
    public  String toAdd(Map<String,Object>map, HttpSession session){
        return "enterprise/ent/add";
    }

    //监督管理信息
    @GetMapping("/assessInfo")
    public String assess(){
        return "enterprise/manage/assess";
    }
    @GetMapping("/infoComp")
    public String comp(){
        return "enterprise/manage/comp";
    }

    //企业管理信息
    @GetMapping("/toBasic")
    public String toBasic(Map<String,Object> map){
        final Company company = companyMapper.allMessage();
        map.put("company",company);
        return "enterprise/info/basic";
    }
    @GetMapping("/toPerson")
    public String toPerson(Map<String,Object> map){
        final Company company = companyMapper.allMessage();
        map.put("company",company);
        return "enterprise/info/person";
    }
    @GetMapping("/toElse")
    public String toElse(Map<String,Object> map){
        final Company company = companyMapper.allMessage();
        map.put("company",company);
        return "enterprise/info/else";
    }

    @GetMapping("/total")
    public String total(Map<String,Object> map){
        final Company company = companyMapper.allMessage();
        map.put("company",company);
        return "enterprise/info/total";
    }
}

