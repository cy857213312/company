package com.imufe.company.mapper;

import com.imufe.company.entity.Grademanage;
import org.springframework.stereotype.Repository;


@Repository
public interface GrademanageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Grademanage record);

    int insertSelective(Grademanage record);

    Grademanage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Grademanage record);

    int updateByPrimaryKey(Grademanage record);
}