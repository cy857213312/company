package com.imufe.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnterpriseController {
    //企业自查信息
    @GetMapping("/entData")
    public String data(){
        return "enterprise/ent/data";
    }
    @GetMapping("/hidden")
    public String check(){
        return "enterprise/ent/check";
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
    public String toBasic(){
        return "enterprise/info/basic";
    }
    @GetMapping("/toPerson")
    public String toPerson(){
        return "enterprise/info/person";
    }
    @GetMapping("/toElse")
    public String toElse(){
        return "enterprise/info/else";
    }

    @GetMapping("/total")
    public String total(){
        return "enterprise/info/total";
    }
}

