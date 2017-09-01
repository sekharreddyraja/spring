package com.spring.ioc.scope;

import org.springframework.beans.factory.annotation.Autowired;

public class MySingleTonScopeBean {

	@Autowired
	private MyPrimaryScopeBean bean;
	
	public void showMessage() {
		System.out.println("hi.."+bean.getDateTime());
	}
}
