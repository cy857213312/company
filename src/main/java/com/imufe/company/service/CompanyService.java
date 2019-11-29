package com.imufe.company.service;

import com.imufe.company.dto.CompanyDto;
import com.imufe.company.entity.Company;
import io.swagger.models.auth.In;

import java.util.List;

public interface CompanyService {

    List<Company> selectAllCompany();

    String insertCompany(Company company);

    String deleteCompany(Integer id);

    String updateCompany(Company company);

    Company selectSingleCompany(Integer id);

    CompanyDto selectCompanyDto(Integer id);


}
