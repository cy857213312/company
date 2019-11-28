package com.imufe.company.service.Impl;


import com.imufe.company.dto.UserDto;
import com.imufe.company.entity.Company;
import com.imufe.company.entity.User;
import com.imufe.company.mapper.CompanyMapper;
import com.imufe.company.mapper.SecurityDepartmentMapper;
import com.imufe.company.mapper.UserMapper;
import com.imufe.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    SecurityDepartmentMapper securityDepartmentMapper;
    @Autowired
    CompanyMapper companyMapper;
    @Override
    public List<UserDto> selectUserBySecDep() {
        List<UserDto> userDtos = userMapper.selectUserBySecDep();
        for (UserDto u:userDtos) {
            u.setDepartmentName(securityDepartmentMapper.selectByPrimaryKey(u.getTId()).getName());
        }
        return userDtos;
    }

    @Override
    public  List<UserDto> selectUserByCompany() {
        List<UserDto> userDtos = userMapper.selectUserByCompany();
        for (UserDto u:userDtos) {
            u.setDepartmentName(companyMapper.selectByPrimaryKey(u.getTId()).getName());
        }
        return userDtos;
    }


    @Override
    public User selectUserBySecDepId(Integer id) {
        return userMapper.selectUserBySecDepId(id);
    }

    @Override
    public User selectUserByCompanyId(Integer id) {
        return userMapper.selectUserByCompanyId(id);
    }

    @Override
    @Transactional
    public String updateByPrimaryKeySelective(User user) {
        try {
            userMapper.updateByPrimaryKeySelective(user);
            return "success";
        }catch (Exception e){
            return "fail";
        }
    }
}
