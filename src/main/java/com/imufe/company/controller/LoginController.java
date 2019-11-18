package com.imufe.company.controller;
import com.imufe.company.entity.Company;
import com.imufe.company.entity.Pos;
import com.imufe.company.entity.User;
import com.imufe.company.mapper.AreaMapper;
import com.imufe.company.mapper.CompanyMapper;
import com.imufe.company.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    UserMapper userMapper;
    @Autowired
    AreaMapper areaMapper;
    @Autowired
    CompanyMapper companyMapper;

    @PostMapping("/login")
    public String login (HttpSession session, String account, String password, Map<String, Object> map) {
        final List<Pos> poss= areaMapper.getPoss();
        if(!StringUtils.isEmpty(account)
                && !StringUtils.isEmpty(password)) {
            User user = userMapper.getUserByAccount(account);
            if(user != null && user.getPassword().equals(password)) {
                //登录成功
                session.setAttribute("loginUser", user);
                //指相地图
                session.setAttribute("poss",poss);
                //传入坐标
                String companyName=poss.get(0).getCompanyName();
                final Company pos = companyMapper.selectByCompanyName(companyName);
                session.setAttribute("longitude",pos.getLongitude());
                session.setAttribute("latitude",pos.getLatitude());
                //重定向 redirect：可以重定向到任意一个请求中（包括其他项目），地址栏改变
                return "redirect:/main.html";
            }
        }
        //登录失败
        map.put("msg", "用户名或密码错误");
        return "gov/login";

    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        //1.清空session中的用户信息
        session.removeAttribute("loginUser");
        //2.再将session进行注销
        session.invalidate();
        //3.返回登录页面
        return "redirect: /index.html";
    }


}

