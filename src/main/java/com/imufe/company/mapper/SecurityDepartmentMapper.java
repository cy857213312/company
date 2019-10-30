package com.imufe.company.mapper;

import com.imufe.company.entity.SecurityDepartment;
import org.springframework.stereotype.Repository;


@Repository
public interface SecurityDepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecurityDepartment record);

    int insertSelective(SecurityDepartment record);

    SecurityDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecurityDepartment record);

    int updateByPrimaryKey(SecurityDepartment record);
}