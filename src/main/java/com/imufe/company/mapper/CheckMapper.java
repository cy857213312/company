package com.imufe.company.mapper;

import com.imufe.company.entity.Check;
import org.springframework.stereotype.Repository;


@Repository
public interface CheckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Check record);

    int insertSelective(Check record);

    Check selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Check record);

    int updateByPrimaryKey(Check record);
}