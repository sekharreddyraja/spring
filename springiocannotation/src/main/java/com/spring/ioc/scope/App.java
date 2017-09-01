package com.spring.ioc.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class App {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	MyPrimaryScopeBean beanP() {
		return new MyPrimaryScopeBean();
	}
	
	@Bean
	MySingleTonScopeBean beanS() {
		return new MySingleTonScopeBean();
	}
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(App.class);
		MySingleTonScopeBean sBean=context.getBean(MySingleTonScopeBean.class);
		sBean.showMessage();
		Thread.sleep(1000);
		sBean=context.getBean(MySingleTonScopeBean.class);
		sBean.showMessage();
	}
}
