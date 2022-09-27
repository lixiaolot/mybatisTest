package com.lixiaolong.dao;

import com.lixiaolong.pojo.User;
import com.lixiaolong.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    @Test
    public void test(){
//        获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        //方式1
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

//        //方式2
//        List<User> userList = sqlSession.selectList("com.lixiaolong.dao.UserDao.getUserList");

        for (User user : userList){
            System.out.println(user);
        }

        //关闭Sqlsession
        sqlSession.close();
    }
}
