package cn.com.mapper;

import cn.com.pojo.Users;

import java.util.List;

public interface UsersMapper {

    void insertUser(Users users);

    List<Users> selectUserAll();

}
