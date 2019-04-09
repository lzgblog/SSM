package com.spring.factory;

public class Factory {

	public BookService createService() {
		return new BookServiceImpl();
	}
}
