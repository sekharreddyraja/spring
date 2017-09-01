package com.spring.beanautowiring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanAutoWiringByName {

	@Bean
	B b() {
		return new B("from b");
	}
	@Bean
	B b1() {
		return new B("from b1");
	}
	@Bean(autowire=Autowire.BY_NAME)
	A a() {
		return new A();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanAutoWiringByName.class);
		A a=context.getBean(A.class);
		a.doSomethisn();
	}
	
	
	
	public static class A{
		@Autowired
		private B b;

		public void doSomethisn() {
			System.out.println(b.getMsg());
		}
	}
	
	
	public static class B{
		
		private String msg;

		public B(String msg) {
			super();
			this.msg = msg;
		}

		public String getMsg() {
			return msg;
		}
		
	}
	
	

}
