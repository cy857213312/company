package com.imufe.company.mapper;

import com.imufe.company.entity.Company;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyMapper {
    Company selectByCompanyName(String companyName);
    //企业信息
    Company allMessage();

    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}