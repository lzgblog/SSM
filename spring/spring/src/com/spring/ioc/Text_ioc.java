package com.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text_ioc {
	@Test
	public void test1(){
		//原始方法
		UserService userService=new UserServiceImpl();
		userService.addUser();
	}
	@Test
	public void test2(){
		//spring实例化   从配置文件中获取对象
		String path="/com/spring/ioc/beans.xml";
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext(path);
		UserService userService = (UserService) applicationcontext.getBean("userServiceId");
		userService.addUser();
	}
}
