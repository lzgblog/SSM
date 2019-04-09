package com.springaop.aspectj_anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspectJAnno {
	@Test
	public void test1(){
		String path="com/springaop/aspectj_anno/beans.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
		UserService user=(UserService) applicationContext.getBean("userService");
		user.addUser();
		user.updateUser();
		user.deleteUser();
	}
}
