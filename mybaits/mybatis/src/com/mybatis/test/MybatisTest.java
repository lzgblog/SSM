package com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.po.User;

public class MybatisTest {
	//查询一个用户
	@Test
	public void selecttest1() throws Exception {
		//1、读取配置文件
		String resource="SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//2、根据配置文件创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//3、SqlSessionFactory创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//4、SqlSession执行statement，并返回映射结果
				//第一个参数：statement的id，建议：namespace.statementId（确保唯一）
				//第二个参数：入参的值，它的类型要和映射文件中对应的statement的入参类型一致
		User user = sqlSession.selectOne("text.findUserById",1);
		//打印输出结果集
		System.out.println(user);
		//5、关闭SqlSession
		sqlSession.close();
	}
	//查询多个用户
	@Test
	public void selecttest2() throws Exception {
		String resource="SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> list = sqlSession.selectList("text.findUsersByName","小明");
		
		for (User user : list) {
			System.out.println(user);
		}
		
		sqlSession.close();
	}
	//添加用户
	@Test
	public void insertTest3() throws Exception {
		String resource="SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user=new User();
		user.setUsername("李四");
		user.setSex("男");
		user.setAddress("北京");
		sqlSession.insert("text.insertUsers", user);
		System.out.println(user.getId());
		//openSession方法中默认设置开启事务    所有必须提交事务
		sqlSession.commit();
		sqlSession.close();
	}
	//删除用户
	@Test
	public void deleteTest4() throws Exception {
		String resource="SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int delete = sqlSession.delete("text.deleteUserByUserName","李四");
		if(delete>0) {
			System.out.println("delete success");
		}
		sqlSession.commit();
		sqlSession.close();
	}
	//修改用户信息
	@Test
	public void updateTest5() throws Exception {
		String resource="SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = new User();
		user.setUsername("ss");
		user.setAddress("北京");
		user.setSex("男");
		sqlSession.update("text.updateUserInfo", user);
		sqlSession.commit();
		sqlSession.close();
	}
}
