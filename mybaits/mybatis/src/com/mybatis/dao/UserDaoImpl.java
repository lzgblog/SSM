package com.mybatis.dao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.po.User;

public class UserDaoImpl implements UserDao {
	private SqlSessionFactory sqlSessionFactory;
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
		this.sqlSessionFactory=sqlSessionFactory;
	}

	public User findUserById(int id) throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();
		User user = openSession.selectOne("text.findUserById", id);
		openSession.close();
		return user;
	}

	public void insertUser(User user) {
		
		SqlSession openSession = sqlSessionFactory.openSession();
		
		openSession.insert("text.insertUsers",user);
		//记得提交事务
		openSession.commit();
		openSession.close();
	}

}
