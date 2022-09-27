package com.lixiaolong.dao;

import com.lixiaolong.pojo.User;

public interface UserMapper {
    //根据id查询用户
    User getUserById(int id);
}
