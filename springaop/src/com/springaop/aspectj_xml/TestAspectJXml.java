package com.springaop.aspectj_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspectJXml {
	@Test
	public void test1(){
		String path="com/springaop/aspectj_xml/beans.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
		UserService userService=(UserService) applicationContext.getBean("userService");
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
