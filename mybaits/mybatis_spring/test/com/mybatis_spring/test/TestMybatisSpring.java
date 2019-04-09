package com.mybatis_spring.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis_spring.dao.UserDao;
import com.mybatis_spring.mapper.UserMapper;
import com.mybatis_spring.po.User;

public class TestMybatisSpring {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		String path="spring/applicationContext.xml";
		applicationContext = new ClassPathXmlApplicationContext(path);
	}
	@Test
	public void test1() {
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User result = userDao.findUserById(1);
		System.out.println(result);
	}
	@Test
	public void test2() {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("user");
		User result = userMapper.findUserById(1);
		System.out.println(result);
	}
	@Test
	public void test3() {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("user");
		User result = userMapper.findUserById(10);
		System.out.println(result);
	}
	
}
