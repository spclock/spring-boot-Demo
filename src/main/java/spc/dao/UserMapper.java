package spc.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import spc.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from USER where id=#{id}")
    List<User> getUsersById(@Param("id")Integer id);
}
