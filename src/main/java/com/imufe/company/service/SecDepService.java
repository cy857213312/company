package com.imufe.company.service;

import com.imufe.company.entity.SecurityDepartment;
import io.swagger.models.auth.In;

import java.util.List;

public interface SecDepService {
    List<SecurityDepartment> selectAllSecDep();

    String insertSecDep(SecurityDepartment securityDepartment);

    String deleteSecDep(Integer id);

    String updateSecDep(SecurityDepartment securityDepartment);

    SecurityDepartment selectSingleSecDep(Integer id);
}
