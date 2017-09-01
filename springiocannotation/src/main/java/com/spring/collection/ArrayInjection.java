package com.spring.collection;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArrayInjection {

	@Bean
	String[] str() {
		return new String[] {"raja","sekhar"};
	}
	@Bean
	TestBean testBean() {
		return new TestBean(new String[] {"raja","sekhar"});
	}
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ArrayInjection.class);
		TestBean t=context.getBean(TestBean.class);
		System.out.println(Arrays.toString(t.getStr()));
	}
	
	public static class TestBean{
		
		private String[] str;

		
		public TestBean() {
			super();
			// TODO Auto-generated constructor stub
		}

		public TestBean(String[] str) {
			super();
			this.str = str;
		}

		public String[] getStr() {
			return str;
		}

		public void setStr(String[] str) {
			this.str = str;
		}
		
	}
}
