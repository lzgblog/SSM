package com.spring.setter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetter {
	@Test
	public void test1(){
		String path="com/spring/setter/beans.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
		User user=(User) applicationContext.getBean("user");
		System.out.println(user);
	}
}
