package com.imufe.company.service.Impl;

import com.imufe.company.entity.Admin;
import com.imufe.company.mapper.AdminMapper;
import com.imufe.company.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    @Transactional
    public Boolean adminRegister(Admin admin) {
        try {
            adminMapper.insertSelective(admin);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    @Override
    @Transactional
    public Admin adminLogin(Admin admin) {
        return adminMapper.adminLogin(admin.getName(),admin.getPassword());
    }
}
