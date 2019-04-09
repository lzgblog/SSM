package com.spring.di;

public class BookServiceImpl implements BookService {
	//接口+setter
	//BookDao 属性名bookDao
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	//调用BookDao对象中的方法
	@Override
	public void addBook() {
		this.bookDao.addBook();
	}

}
