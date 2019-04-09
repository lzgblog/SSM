package com.mybatis.dao;

import com.mybatis.po.User;

public interface UserDao {
	//查询用户
	public User findUserById(int id) throws Exception;
	//添加用户
	public void insertUser(User user) throws Exception;
}
