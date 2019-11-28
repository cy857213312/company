package com.imufe.company.service;

import com.imufe.company.dto.UserDto;
import com.imufe.company.entity.Company;
import com.imufe.company.entity.User;

import java.util.List;

public interface UserService {

    List<UserDto> selectUserBySecDep();

    List<UserDto> selectUserByCompany();

    User selectUserByCompanyId(Integer id);

    User selectUserBySecDepId(Integer id);

    String updateByPrimaryKeySelective(User user);
}
