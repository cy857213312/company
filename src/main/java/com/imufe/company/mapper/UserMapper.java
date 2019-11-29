package com.imufe.company.mapper;

import com.imufe.company.dto.UserDto;
import com.imufe.company.entity.Company;
import com.imufe.company.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User getUserByAccount(String account);
    List<User> getUsers(User user);
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("SELECT *\n" +
            "FROM user u\n" +
            "WHERE u.`type`=1")
    List<UserDto> selectUserBySecDep();

    @Select("SELECT *\n" +
            "FROM user u\n" +
            "WHERE u.`type`=0")
    List<UserDto> selectUserByCompany();


    @Select("SELECT *\n" +
            "FROM user u\n" +
            "WHERE u.`type`=0 AND u.t_id=#{cId}")
    User selectUserByCompanyId(Integer cId);

    @Select("SELECT *\n" +
            "FROM user u\n" +
            "WHERE u.`type`=1 AND u.t_id=#{sId}")
    User selectUserBySecDepId(Integer sId);
}