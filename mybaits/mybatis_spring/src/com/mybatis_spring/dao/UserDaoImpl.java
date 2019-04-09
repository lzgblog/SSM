package com.mybatis_spring.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.mybatis_spring.dao.UserDao;
import com.mybatis_spring.po.User;
//原始dao方式   继承SqlSessionDaoSupport
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	public User findUserById(int id) {
		
		return this.getSqlSession().selectOne("test.findUserById",id);
	}

}
