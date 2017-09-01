package com.spring.environment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

public class Environment {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		ConfigurableEnvironment env= context.getEnvironment();
		for(PropertySource<?> propertySource:env.getPropertySources()) {
			  System.out.println("name =  " + propertySource.getName() + "\nsource = " + propertySource
                      .getSource().getClass()+"\n");
		}
		env.getSystemEnvironment().entrySet().stream().forEach(e->System.out.println(e.getKey()+"..."+e.getValue()));
		env.getSystemProperties().entrySet().stream().forEach(e->System.out.println(e.getKey()+"..."+e.getValue()));
		context.registerShutdownHook();
	}
}
