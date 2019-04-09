package com.spring.annotation.account;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {
	@Test
	public void test1(){
		String path="com/spring/annotation/account/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
		AccountService account = (AccountService) applicationContext.getBean("accountService");
		account.tranfer("tom", "jerry", 1000);
	}
	
}
