package com.lixiaolong.dao;

import com.lixiaolong.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List <User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //insert用户
    int addUser(User user);


    int addUser2(Map<String,Object> map);

    int updateUser(User user);

    int deleteUser(int id);
}
