package com.spring.primary;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Primary {

	@Bean(autowire=Autowire.BY_TYPE,name="client")
	Client client() {
		return new Client();
	}
	
	@Bean(name="daoA")
	DaoA daoA() {
		return new DaoA();
	}
	
	@Bean(name="daoB")
	@org.springframework.context.annotation.Primary
	DaoB daoB() {
		return new DaoB();
	}
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Primary.class);
		Client c=context.getBean(Client.class);
		c.doSomething();
		List<String> list=new ArrayList<>();
		
		Optional<String> op=Optional.empty();
	}
	
}
