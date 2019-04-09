package com.springaop.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
	@Test
	public void test1(){
		String path="com/springaop/aop/beans.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
		UserService user=(UserService) applicationContext.getBean("userService");
		user.addUser();
		user.updateUser();
		user.deleteUser();
	}
}
