package com.spring.xml.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//Junit和spring整合

@RunWith(SpringJUnit4ClassRunner.class)
//需要导入spring-text  包
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestAccount {
	@Autowired   //与junit整合，不需要在spring xml配置扫描
	private AccountService account;
	@Test
	public void test1(){
//		String path="applicationContext.xml";
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
//		AccountService account = (AccountService) applicationContext.getBean("accountService");
		account.tranfer("tom", "jerry", 1000);
	}
	
}
