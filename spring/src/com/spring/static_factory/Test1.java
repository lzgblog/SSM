package com.spring.static_factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	//方法一：
	@Test
	public void test(){
		BookService cs = StaticFactory.createService();
		cs.addBook();
	}
	//方法二：
		@Test
		public void test2(){
			String path="com/spring/static_factory/beans.xml";
			ApplicationContext applicationcontext=new ClassPathXmlApplicationContext(path);
			BookService bs=(BookService) applicationcontext.getBean("bookServiceImpl");
			bs.addBook();
		}
}
