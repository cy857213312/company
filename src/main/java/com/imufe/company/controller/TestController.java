package com.imufe.company.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/say")
@Api(value = "测试Swagger2")
public class TestController {

    @PostMapping("/he")
    public String index(@RequestParam("query") String query){

        return "index.html";
    }
}
