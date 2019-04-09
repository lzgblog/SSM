package com.spring.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
		@Test
		public void test2(){
			String path="com/spring/annotation/beans.xml";
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
			WServlet ws=(WServlet) applicationContext.getBean("servletId");
			ws.method();
			System.out.println(ws);
		}
}
