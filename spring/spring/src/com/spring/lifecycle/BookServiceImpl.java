package com.spring.lifecycle;

public class BookServiceImpl implements BookService {

	@Override
	public void addBook() {
		System.out.println("factory");
	}
	public void init(){
		System.out.println("初始化-----");
	}

	public void destroy(){
		System.out.println("销毁----");
	}
}
