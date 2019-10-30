package com.imufe.company.mapper;

import com.imufe.company.entity.GraSubsidiary;
import org.springframework.stereotype.Repository;


@Repository
public interface GraSubsidiaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GraSubsidiary record);

    int insertSelective(GraSubsidiary record);

    GraSubsidiary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GraSubsidiary record);

    int updateByPrimaryKey(GraSubsidiary record);
}