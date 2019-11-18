package com.imufe.company.mapper;

import com.imufe.company.dto.PosDto;
import com.imufe.company.entity.Area;
import com.imufe.company.entity.Pos;
import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AreaMapper {
    List<Pos> getPoss();
    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

    @Select("select a.name AS areaName,c.name AS companyName\n" +
            "from area a left join company c on a.id=c.area_id")
    List<PosDto> selcetPos();
}