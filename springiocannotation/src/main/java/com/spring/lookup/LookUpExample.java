package com.spring.lookup;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = Sigleton.class)
public class LookUpExample {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	Prototype p() {
		return new Prototype();
	}
	
	/*@Bean
	Sigleton s() {
		return new Sigleton();
	}*/
	public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(LookUpExample.class);
	Sigleton s=context.getBean(Sigleton.class);
	s.showMessage();
	
	}
}
