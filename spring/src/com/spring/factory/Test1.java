package com.spring.factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.static_factory.StaticFactory;

public class Test1 {
		@Test
		public void test2(){
			String path="com/spring/factory/beans.xml";
			ApplicationContext applicationcontext=new ClassPathXmlApplicationContext(path);
			BookService bs=(BookService) applicationcontext.getBean("bookService");
			bs.addBook();
		}
}
