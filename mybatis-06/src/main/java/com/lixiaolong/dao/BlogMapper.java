package com.lixiaolong.dao;

import com.lixiaolong.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入
    int addBlog(Blog blog);

    List<Blog> queryBlogIf(Map map);
}
