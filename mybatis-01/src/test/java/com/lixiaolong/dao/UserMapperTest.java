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
@Test
    public void getUserById(){
        //        获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);



        //关闭Sqlsession
        sqlSession.close();

    }
    //需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res =mapper.addUser(new User(4,"hhh","12324"));

        if(res>0){
            System.out.println("success");
        }
        //提交
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res =mapper.updateUser(new User(4,"12321","12324"));

        if(res>0){
            System.out.println("success");
        }
        //提交
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res =mapper.deleteUser(4);

        if(res>0){
            System.out.println("success");
        }
        //提交
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
         Map<String,Object> map = new HashMap<String, Object>();
         map.put("userid",6);
         map.put("pwd","555");
        int res =mapper.addUser2(map);

        if(res>0){
            System.out.println("success");
        }
        //提交
        sqlSession.commit();
        sqlSession.close();

    }
}
