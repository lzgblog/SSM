package com.spring.annotation;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceAnnotImpl implements ServiceAnnto {
	
	@Autowired
	@Qualifier("daoId")
	//@Resource(name="daoId")
	private Dao dao;
	
	/*public void setDao(Dao dao) {
		this.dao = dao;
	}*/

	public void serviceMethod() {
		//System.out.println("serviceMethod....");
		this.dao.daoMethod();
	}

}
