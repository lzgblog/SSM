package com.spring.factory;

public class BookServiceImpl implements BookService {

	@Override
	public void addBook() {
		System.out.println("factory");
	}

}
