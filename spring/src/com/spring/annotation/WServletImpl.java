package com.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component("servletId")
@Controller("servletId")
public class WServletImpl implements WServlet {
//使用注解来创建对象
	@Value("tom")
	private String name;
	@Value("18")
	private String age;
	//依赖注入   引用值
	@Autowired
	private ServiceAnnto service;
	public void method() {
		//System.out.println("Servlet......");
		this.service.serviceMethod();
	}
	//初始化
	@PostConstruct
	public void initMethod(){
		System.out.println("initMethod...");
	}
	//销毁
	@PreDestroy
	public void destroyMethod(){
		System.out.println("destroyMethod...");
	}
	
	@Override
	public String toString() {
		return "WServletImpl [name=" + name + ", age=" + age + ", service="
				+ service + "]";
	}
	
}
