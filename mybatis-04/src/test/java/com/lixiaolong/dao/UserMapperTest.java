package com.lixiaolong.dao;

import com.lixiaolong.pojo.User;
import com.lixiaolong.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


public class UserMapperTest {

   static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void test(){
//        获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        logger.info("进入查询");
        //执行sql
        //方式1
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);

//        //方式2
//        List<User> userList = sqlSession.selectList("com.lixiaolong.dao.UserDao.getUserList");
            System.out.println(user);

        //关闭Sqlsession
        sqlSession.close();
    }

    @Test
    public void testlog4j(){
        logger.info("info:进入了testLog4J");
        logger.debug("debug:进入了testLog4J");
        logger.error("error:进入了testLog4J");

    }
}
