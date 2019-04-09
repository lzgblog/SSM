package com.mybatis.test;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.dao.MapperDao;
import com.mybatis.dao.UserDao;
import com.mybatis.dao.UserDaoImpl;
import com.mybatis.po.User;


public class DaoTest {

	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		// 读取配置文件
		// 全局配置文件的路径
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void testFindUserById() throws Exception {

		// 创建UserDao
		UserDao dao = new UserDaoImpl(sqlSessionFactory);

		User user = dao.findUserById(1);
		System.out.println(user);
	}
	@Test
	public void findUserById() throws Exception {
		
		UserDao daoImpl = new UserDaoImpl(sqlSessionFactory);
		User findUserById = daoImpl.findUserById(1);
		System.out.println(findUserById);
	}
	@Test
	public void insertUser() throws Exception {
		UserDao userDaoImpl = new UserDaoImpl(sqlSessionFactory);
		User user = new User();
		user.setAddress("北京");
		user.setUsername("李华");
		user.setSex("男");
		userDaoImpl.insertUser(user);
	}
	//动态sql
	@Test
	public void findUserByNameAndSex() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();
		MapperDao mapper = openSession.getMapper(MapperDao.class);
		User user = new User();
		user.setUsername("李华");
		user.setSex("n");
		List<User> result = mapper.findUserByNameAndSex(user);
		System.out.println(result);
	}
	//foreach方式  查询用户
	@Test
	public void findUserByManyId() throws Exception{
		SqlSession openSession = sqlSessionFactory.openSession();
		MapperDao mapper = openSession.getMapper(MapperDao.class);
		User user = new User();
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		user.setIdlist(list);
		List<User> result = mapper.findUserByManyId(user);
		System.out.println(result);
	}
}






