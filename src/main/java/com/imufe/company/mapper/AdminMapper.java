package com.imufe.company.mapper;

import com.imufe.company.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

@Repository
public interface AdminMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    @Select("SELECT *\n" +
            "FROM admin a\n" +
            "WHERE  a.name=#{name} AND a.password=#{password}")
    Admin adminLogin(@Param("name") String name, @Param("password") String password);
}