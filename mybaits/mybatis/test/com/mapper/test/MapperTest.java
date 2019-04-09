package com.mapper.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.dao.MapperDao;
import com.mybatis.po.User;

public class MapperTest {
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
	public void findUserById() throws Exception {

		SqlSession openSession = sqlSessionFactory.openSession();
		MapperDao mapper = openSession.getMapper(MapperDao.class);
		User user = mapper.findUserById(1);
		System.out.println(user);
		openSession.close();
	}
}
