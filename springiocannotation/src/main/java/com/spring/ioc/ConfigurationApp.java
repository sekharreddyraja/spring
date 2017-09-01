package com.spring.ioc;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
//@Import(ConfigurationApp1.class)
//@ComponentScan(basePackages="com.spring.ioc")
public class ConfigurationApp {

	/*@Bean(autowire=Autowire.NO)
	@Lazy
	Hello hello1() {
		return new Hello();
	}*/
	
	@Bean(autowire=Autowire.BY_NAME,initMethod="init",destroyMethod="destory",name="hello2")
//	@DependsOn("hi")
	Hello hello2() {
		return new Hello();
	}

	@Bean(name="hi")
//	@Lazy
	Hi hi() {
		return new Hi();
	}
	
	@Autowired
	@Lazy
	Hello hel;
	
	/*@Bean
	C c() {
		return new C();
	}
	/// by type injection
	@Bean
	B b(C c) {
		return new B(c);
	}*/
	
	@Bean
	C c1() {
		return new C();
	}
	// by name injection
	@Bean
	B b1(C c1) {
		return new B(c1);
	}
	
}

