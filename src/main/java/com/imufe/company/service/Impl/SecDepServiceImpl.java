package com.imufe.company.service.Impl;

import com.imufe.company.entity.SecurityDepartment;
import com.imufe.company.mapper.SecurityDepartmentMapper;
import com.imufe.company.service.SecDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SecDepServiceImpl implements SecDepService {

    @Autowired
    SecurityDepartmentMapper securityDepartmentMapper;

    @Override
    public List<SecurityDepartment> selectAllSecDep() {
        return securityDepartmentMapper.selectAllSecDep();
    }

    @Override
    @Transactional
    public String insertSecDep(SecurityDepartment securityDepartment) {
        try {
            securityDepartmentMapper.insertSelective(securityDepartment);
            return "success";
        }catch (Exception e){
            return "fail";
        }
    }

    @Override
    @Transactional
    public String deleteSecDep(Integer id) {
        try {
            securityDepartmentMapper.deleteByPrimaryKey(id);
            return "success";
        }catch (Exception e){
            return "fail";
        }
    }

    @Override
    @Transactional
    public String updateSecDep(SecurityDepartment securityDepartment) {
        try {
            securityDepartmentMapper.updateByPrimaryKeySelective(securityDepartment);
            return "success";
        }catch (Exception e){
        return "fail";}
    }

    @Override
    public SecurityDepartment selectSingleSecDep(Integer id) {
        return securityDepartmentMapper.selectByPrimaryKey(id);
    }
}
