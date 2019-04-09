package com.mybatis_spring.mapper;

import com.mybatis_spring.po.User;

public interface UserMapper {
	//根据id查询用户信息
	public User findUserById(int id);
}
