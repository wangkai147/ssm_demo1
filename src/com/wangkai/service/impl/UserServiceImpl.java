package com.wangkai.service.impl;

import com.wangkai.dao.UserDao;
import com.wangkai.pojo.User;
import com.wangkai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public User getUserByName(String username) {
        return userDao.getUserByName(username);
    }
}
