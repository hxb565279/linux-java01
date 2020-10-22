package com.hxb.core.dao;

import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int register(@Param("username") String username,@Param("password") String password);
}