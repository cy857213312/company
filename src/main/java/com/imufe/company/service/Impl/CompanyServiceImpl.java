package com.imufe.company.service.Impl;

import com.imufe.company.common.config.ResultType;
import com.imufe.company.dto.CompanyDto;
import com.imufe.company.entity.Company;
import com.imufe.company.mapper.AreaMapper;
import com.imufe.company.mapper.CompanyMapper;
import com.imufe.company.mapper.SecurityDepartmentMapper;
import com.imufe.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;
    @Autowired
    SecurityDepartmentMapper securityDepartmentMapper;
    @Autowired
    AreaMapper areaMapper;
    @Override
    public List<Company> selectAllCompany() {
        return companyMapper.selectAllCompany();
    }

    @Override
    @Transactional
    public String insertCompany(Company company) {
        try{
            companyMapper.insertSelective(company);
            return "success";
        }catch (Exception e){
              return "fail";
        }
    }

    @Override
    @Transactional
    public String deleteCompany(Integer id) {
        try {

            companyMapper.deleteByPrimaryKey(id);
            return "success";
        }catch (Exception e){
             return "fail";
        }
    }

    @Override
    @Transactional
    public String updateCompany(Company company) {
        try {
            companyMapper.updateByPrimaryKeySelective(company);
            return "success";
        }catch (Exception e){
        return "fail";}
    }

    @Override
    public Company selectSingleCompany(Integer id) {
        return companyMapper.selectByPrimaryKey(id);
    }

    @Override
    public CompanyDto selectCompanyDto(Integer id) {

        CompanyDto companyDto = companyMapper.selectCompanyDto(id);
        companyDto.setSecurityDepartment(securityDepartmentMapper.selectByPrimaryKey(companyDto.getSecurityDepartmentId()));
        companyDto.setArea(areaMapper.selectByPrimaryKey(companyDto.getAreaId()));
        return companyDto;
    }


}
