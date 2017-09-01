package com.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Hi {

	@Autowired
	Hello hello;
	
	public Hi() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("hi......");
	}

	public void m() {
		System.out.println("from hiiii...");
	}
}
