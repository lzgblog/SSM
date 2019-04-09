package com.mybatis.dao;

import java.util.List;

import com.mybatis.po.User;

public interface MapperDao {
	//查询用户
	public User findUserById(int id) throws Exception;
	//添加用户
	public void insertUser(User user) throws Exception;
	//简单类型输出
	public int findUserCount(String username) throws Exception;
	//resultMap入门
	public User findUserByResultMap(int id) throws Exception;
	//动态sql
	public List<User> findUserByNameAndSex(User user) throws Exception;
	//foreach遍历标签使用
	public List<User> findUserByManyId(User User) throws Exception;
}
