package com.imufe.company.mapper;

import com.imufe.company.dto.CompanyDto;
import com.imufe.company.entity.Company;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


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

    @Select("SELECT *\n" +
            "FROM company c")
    List<Company> selectAllCompany();

    @Select("SELECT *\n" +
            "FROM company c\n" +
            "WHERE c.id=#{id}")
    CompanyDto selectCompanyDto(Integer id);
}