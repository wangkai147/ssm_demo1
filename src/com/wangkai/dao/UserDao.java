package com.wangkai.dao;

import com.wangkai.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/*
 * 在Mybatis中，数据库访问层只需要设计接口
 */
@Mapper
@Repository
public interface UserDao {
    /*
     * 接口方法对应SQL映射文件UserMapper.xml中的id
     */
    User getUserById(int id);
    User getUserByName(String username);
}
