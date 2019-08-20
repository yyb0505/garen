package cn.com.service.impl;

import cn.com.mapper.UsersMapper;
import cn.com.pojo.Users;
import cn.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
