package com.imufe.company.controller;

import com.imufe.company.dto.Detail;
import com.imufe.company.entity.Check;
import com.imufe.company.entity.Company;
import com.imufe.company.entity.SecurityCheck;
import com.imufe.company.mapper.CheckMapper;
import com.imufe.company.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class ManageController {
    //进入评估页面
    @GetMapping("/into")
    public String into(){
        return "redirect:/into.html";
    }
    /**
     * 监督管理信息
     */
    //折线图生成相关点
    @Autowired
    CheckMapper checkMapper;
    @GetMapping("/assess")
    public String assess(Map<String,Object> map){
        final List<Check> point = checkMapper.selectChecks();
        map.put("point",point);
        return "gov/reg/assess";
    }

    //监管检查栏相关
    //检查记录
    @GetMapping("/checks")
    public String check(Map<String,Object>map){
        final List<SecurityCheck> checks = checkMapper.getChecks();
        map.put("checks",checks);
        return "gov/reg/check";
    }
    //前往添加页面
    @GetMapping("/add")
    public  String toAddPage(Map<String,Object>map, HttpSession session){
        //检查部门名，根据当前登录id显示
        return "gov/reg/add";
    }
    @PostMapping("/add")
    public String add(Check check){
        checkMapper.insert(check);
        return "gov/reg/entry";
    }
    @PostMapping("/input")
    public String input(Check check){
        checkMapper.insert(check);
        return "gov/reg/reg";
    }

    //查看详细信息
    @GetMapping("/view/{id}")
    public  String view(@PathVariable("id") Integer id, Map<String,Object> map){
        final Detail detail = checkMapper.selectByPrimaryKey(id);
        map.put("detail",detail);
        return "gov/reg/view";
    }
    //信息对比页面
    @GetMapping("/comp")
    public String toComp(){
        return "gov/reg/comp";
    }
    /**
     *企业信息管理
     */
    //进入自查数据页面
    @GetMapping("/check")
    public String toCheck(){
        return "gov/ent/check";
    }

    //进入基本信息页面
    @Autowired
    CompanyMapper companyMapper;
    @GetMapping("/basic")
    public String toBasic(Map<String,Object> map){
        final Company company = companyMapper.allMessage();
        map.put("company",company);
        return "gov/ent/basic";
    }
    //进入人员信息页面
    @GetMapping("/person")
    public String toPerson(Map<String,Object> map){
        final Company company = companyMapper.allMessage();
        map.put("company",company);
        return "gov/ent/person";
    }
    //进入其它信息页面
    @GetMapping("/else")
    public String toElse(Map<String,Object> map){
        final Company company = companyMapper.allMessage();
        map.put("company",company);
        return "gov/ent/else";
    }
}

