package com.springaop.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
	@Test
	public void test1(){
		String path="com/springaop/bean/beans.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
		//proxyServiceId代理类的id
		UserService userService=(UserService) applicationContext.getBean("proxyServiceId");
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
		
	}
}
