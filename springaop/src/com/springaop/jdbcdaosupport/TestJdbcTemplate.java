package com.springaop.jdbcdaosupport;

import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.jdbc.Driver;

public class TestJdbcTemplate {
	@Test
	public void test1(){
		
		/*//1、基于api
		//创建数据源   dbcp数据源连接方式
		BasicDataSource dataSource=new BasicDataSource();
		//设置基本要求
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mydb2");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		//创建JdbcTemplate模板
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		//向模板中封装数据源
		jdbcTemplate.setDataSource(dataSource);
		
		jdbcTemplate.update("INSERT INTO USER(NAME,PASSWORD) VALUES('tom','123')");
		*/
		
		//2、spring配置
		User user = new User();
		user.setName("jack");
		user.setPassword("119");
		String path="com/springaop/jdbcdaosupport/beans.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
		UserDao dao=(UserDao) applicationContext.getBean("userDao");
		//dao.insert(user);
		//dao.update(user);
		/*List<User> u=dao.query();
		for (User user2 : u) {
			System.out.println(user2);
		}*/
		User u=dao.findUser(user.getName());
		System.out.println(u);
	}
}
