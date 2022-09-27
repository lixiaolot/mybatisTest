package com.lixiaolong.dao;

import com.lixiaolong.pojo.User;

import java.util.List;

public interface UserMapper {
    //根据id查询用户
    User getUserById(int id);
}
