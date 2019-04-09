package com.mybatis.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.dao.MapperDao;
import com.mybatis.po.User;
//mapper代理    
//1、	mapper接口的全限定名要和mapper映射文件的namespace值一致。
//2、	mapper接口的方法名称要和mapper映射文件的statement的id一致。
//3、	mapper接口的方法参数类型要和mapper映射文件的statement的parameterType的值一致，而且它的参数是一个。
//4、	mapper接口的方法返回值类型要和mapper映射文件的statement的resultType的值一致。
	

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
	//查询
	@Test
	public void findUserById() throws Exception {

		SqlSession openSession = sqlSessionFactory.openSession();
		MapperDao mapper = openSession.getMapper(MapperDao.class);
		User user = mapper.findUserById(1);
		System.out.println(user);
		openSession.close();
	}
	//添加
	@Test
	public void insertUser() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();
		MapperDao mapper = openSession.getMapper(MapperDao.class);
		User user = new User();
		user.setUsername("莉莉丝");
		user.setAddress("上海");
		user.setSex("女");
		mapper.insertUser(user);
		openSession.commit();
		openSession.close();
	}
	//简单类型输出
	@Test
	public void findUserCount() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();
		MapperDao mapper = openSession.getMapper(MapperDao.class);
		int result = mapper.findUserCount("李华");
		System.out.println(result);
 	}
	//resultMap入门
	@Test
	public void findUserByResultMap()  throws Exception{
		SqlSession openSession = sqlSessionFactory.openSession();
		MapperDao mapper = openSession.getMapper(MapperDao.class);
		User result = mapper.findUserByResultMap(17);
		System.out.println(result);
	} 
}
