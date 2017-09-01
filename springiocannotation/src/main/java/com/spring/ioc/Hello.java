package com.spring.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public  class Hello implements InitializingBean,DisposableBean{

	
	public Hello() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("created hello object");
	}

	public void sayHello() {
		System.out.println("hello");
	}
	
	public void init() {
		System.out.println("from init ");
	}
	
	public void destory() {
		System.out.println("from destory");
	}
	
	@PostConstruct
	public void init250() {
		System.out.println("using post construct");
	}
	
	@PreDestroy
	public void dest250() {
		System.out.println("using pre destroy");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
	System.out.println("from dispo bean");	
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from after prop set");
	}
}
