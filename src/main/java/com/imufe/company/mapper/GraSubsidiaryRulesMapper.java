package com.imufe.company.mapper;

import com.imufe.company.entity.GraSubsidiaryRules;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GraSubsidiaryRulesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GraSubsidiaryRules record);

    int insertSelective(GraSubsidiaryRules record);

    GraSubsidiaryRules selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GraSubsidiaryRules record);

    int updateByPrimaryKey(GraSubsidiaryRules record);

    @Select("SELECT *\n" +
            "FROM gra_subsidiary_rules gsr\n" +
            "WHERE gsr.gra_su_id=#{graSuId}\n")
    List<GraSubsidiaryRules> selectAllGraSubsidiaryRules(@Param("graSuId") Integer graSuId);
}