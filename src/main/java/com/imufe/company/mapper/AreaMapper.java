package com.imufe.company.mapper;

import com.imufe.company.entity.Area;
import org.springframework.stereotype.Repository;


@Repository
public interface AreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}