package com.spring.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	@Test
	public void test(){
		String path="/com/spring/di/beans.xml";
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext(path);
		BookService bs=(BookService) applicationcontext.getBean("bookServiceImpl");
		bs.addBook();
	}
}
