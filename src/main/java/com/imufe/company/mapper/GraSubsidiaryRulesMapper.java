package com.imufe.company.mapper;

import com.imufe.company.entity.GraSubsidiaryRules;
import org.springframework.stereotype.Repository;


@Repository
public interface GraSubsidiaryRulesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GraSubsidiaryRules record);

    int insertSelective(GraSubsidiaryRules record);

    GraSubsidiaryRules selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GraSubsidiaryRules record);

    int updateByPrimaryKey(GraSubsidiaryRules record);
}