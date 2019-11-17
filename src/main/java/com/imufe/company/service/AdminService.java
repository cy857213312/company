package com.imufe.company.service;

import com.imufe.company.entity.Admin;

public interface AdminService {

    Boolean adminRegister(Admin admin);

    Admin adminLogin(Admin admin);
}
