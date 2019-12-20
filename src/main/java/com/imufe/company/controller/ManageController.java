package com.imufe.company.controller;

import com.imufe.company.dto.Detail;
import com.imufe.company.entity.*;
import com.imufe.company.mapper.CheckMapper;
import com.imufe.company.mapper.CompanyMapper;
import com.imufe.company.mapper.GraSubsidiaryMapper;
import com.imufe.company.mapper.GraSubsidiaryRulesMapper;
import javafx.scene.control.Alert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

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
    public String assess(Map<String,Object>map){
        final List<Check> point = checkMapper.selectChecks();
        Integer score[]=new Integer[10];
        Vector date=new Vector();
        String strDateFormat = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        for(int i=0;i<point.size();++i){
            Check obj=(Check)point.get(i);
            score[i]=obj.getScore();
            date.add(sdf.format(obj.getCreateTime()));
        }
        map.put("score",score);
        map.put("date",date);
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

        return "gov/reg/add";
    }
    //保存添加内容等
    @Autowired
    GraSubsidiaryMapper graSubsidiaryMapper;
    @Autowired
    GraSubsidiaryRulesMapper graSubsidiaryRulesMapper;
    @PostMapping("/add")
    public String add(Map<String,Object>map,Check check, HttpSession session){
        final List<GraSubsidiary> graSubsidiarys = graSubsidiaryMapper.getGraSubsidiarys();
        final List<GraSubsidiaryRules> rules = graSubsidiaryRulesMapper.getRules();
        map.put("graSubsidiarys",graSubsidiarys);
        map.put("rules",rules);
        return "gov/reg/entry";
    }
    //存入数据库
    @PostMapping("/input")
    public String input(Check check,Map<String,Object>map){
        checkMapper.insert(check);
        final List<SecurityCheck> checks = checkMapper.getChecks();
        map.put("checks",checks);
        return "gov/reg/check";
    }
    //查看结果
    @GetMapping("/reg")
    public String toReg(){
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
    public String toComp(Map<String,Object>map){
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

