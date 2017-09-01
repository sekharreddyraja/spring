package com.spring.collection;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class ListInjection {

	@Bean(autowire=Autowire.BY_NAME)
	public TestBean testBean() {
		return new TestBean();
	}
	
	@Bean
	public List<String> names(){
		return Arrays.asList("raja","sekhar");
	}
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ListInjection.class);
		TestBean t=context.getBean(TestBean.class);
		System.out.println(t.getNames());
	}
	
	public static class TestBean{
		
		private List<String> names;

		public List<String> getNames() {
			return names;
		}
		@Autowired
		public void setNames(List<String> names) {
			this.names = names;
		}
		
	}
}
