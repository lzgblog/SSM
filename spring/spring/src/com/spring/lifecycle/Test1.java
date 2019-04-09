package com.spring.lifecycle;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.static_factory.StaticFactory;

public class Test1 {
		@Test
		public void test3(){
			String path="com/spring/lifecycle/beans.xml";
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
			BookService bs=(BookService) applicationContext.getBean("bookService");
			bs.addBook();
			//关闭spring容器
			/*try {
				applicationContext.getClass().getMethod("close").invoke(applicationContext);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			//关闭spring容器
			((AbstractApplicationContext) applicationContext).close();
		}
}
