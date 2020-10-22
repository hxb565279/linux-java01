package com.hxb.core.service.impl;

import com.hxb.core.dao.UserDao;
import com.hxb.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int register(String username, String password) {
        return this.userDao.register(username,password);
    }
}
