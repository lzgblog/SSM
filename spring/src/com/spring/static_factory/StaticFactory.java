package com.spring.static_factory;

public class StaticFactory {
	//必须创建静态方法
	public static BookService createService(){
		return new BookServiceImpl();//返回BookServiceImpl实例
	}
}
