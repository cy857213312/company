package com.imufe.company.mapper;

import com.imufe.company.entity.GraSubsidiary;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GraSubsidiaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GraSubsidiary record);

    int insertSelective(GraSubsidiary record);

    GraSubsidiary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GraSubsidiary record);

    int updateByPrimaryKey(GraSubsidiary record);

    @Select("SELECT *\n" +
            "FROM gra_subsidiary gs\n" +
            "WHERE gs.g_id=#{gId}\n")
    List<GraSubsidiary> selectAllGraSubsidiary(@Param("gId") Integer gId);

}