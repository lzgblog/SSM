package com.spring.annotation;

import org.springframework.stereotype.Repository;
@Repository("daoId")
public class DaoImpl implements Dao {

	@Override
	public void daoMethod() {
		System.out.println("daoMethod.....");
	}

}
