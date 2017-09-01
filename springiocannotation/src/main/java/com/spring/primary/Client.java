package com.spring.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Client {

	//@Qualifier("daoB")
	//@Autowired
	private DAO dao;
	
	public void doSomething() {
		dao.doSomething();
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	
}
