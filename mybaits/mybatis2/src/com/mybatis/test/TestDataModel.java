package com.mybatis.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.mapper.OrdersMapper;
import com.mybatis.po.OrdersEx;
import com.mybatis.po.User;

public class TestDataModel {
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		String resource="mybatis/SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void test1() {
		SqlSession openSession = sqlSessionFactory.openSession();
		OrdersMapper mapper = openSession.getMapper(OrdersMapper.class);
		@SuppressWarnings("unused")
		List<OrdersEx> result = mapper.findUserAndOrders();
		openSession.close();
	}
	@Test
	public void test2() {
		SqlSession openSession = sqlSessionFactory.openSession();
		OrdersMapper mapper = openSession.getMapper(OrdersMapper.class);
		List<OrdersEx> result = mapper.findUserAndOrdersAsRetMap();
		System.out.println(result);
		openSession.close();
	}
	@Test
	public void test3() {
		SqlSession openSession = sqlSessionFactory.openSession();
		OrdersMapper mapper = openSession.getMapper(OrdersMapper.class);
		List<OrdersEx> result = mapper.findUserAndOrdersAndDetail();
		System.out.println(result);
		openSession.close();
	}
	@Test
	public void test4() {
		SqlSession openSession = sqlSessionFactory.openSession();
		OrdersMapper mapper = openSession.getMapper(OrdersMapper.class);
		List<User> result = mapper.findUserAndOrdersAndDetailAndItems();
		System.out.println(result);
		openSession.close();
	}
	//二级缓存测试   ehcache
	@Test
	public void test5() {
		SqlSession openSession1 = sqlSessionFactory.openSession();
		SqlSession openSession2 = sqlSessionFactory.openSession();
		
		OrdersMapper mapper1 = openSession1.getMapper(OrdersMapper.class);
		OrdersMapper mapper2 = openSession2.getMapper(OrdersMapper.class);
		User result1 = mapper1.findUserById(1);
		System.out.println(result1);
		openSession1.close();
		
		User result2 = mapper2.findUserById(1);
		System.out.println(result2);
		openSession1.close();
		//DEBUG [main] - Cache Hit Ratio [com.mybatis.mapper.OrdersMapper]: 0.5
	}
}
