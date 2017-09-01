package com.spring.environment;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.ConfigurableEnvironment;

@Configuration
@PropertySource("classpath:app.properties")
public class PropertySourceExample {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	TestBean testBean() {
		return new TestBean();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				PropertySourceExample.class);
		ConfigurableEnvironment env = context.getEnvironment();
		System.out.println("using env variable" + env.getProperty("app.name"));
		context.getBean(TestBean.class).showProp();
		Hashtable<String, String> h;
	}

	class TestBean {
		@Value("${app.name}")
		private String name;

		@Value("${app.email:sekhar@gmail.com}")
		private String email;

		public void showProp() {
			System.out.println("name.." + name + "   email.." + email);
		}
	}
}
