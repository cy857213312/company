package com.imufe.company.mapper;

import com.imufe.company.entity.Check;
import com.imufe.company.entity.SecurityCheck;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CheckMapper {
    List<SecurityCheck> getChecks();
    List<Check> selectChecks();
    int deleteByPrimaryKey(Integer id);

    int insert(Check record);

    int insertSelective(Check record);

    Check selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Check record);

    int updateByPrimaryKey(Check record);
}