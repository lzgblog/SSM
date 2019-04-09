package com.mybatis_spring.dao;

import com.mybatis_spring.po.User;

public interface UserDao {
	//根据id查询用户信息
	public User findUserById(int id);
}
