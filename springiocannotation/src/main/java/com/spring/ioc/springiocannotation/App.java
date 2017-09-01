package com.spring.ioc.springiocannotation;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.ioc.*;
import com.spring.ioc.ConfigurationApp;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       // AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationApp.class,ConfigurationApp1.class);
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationApp.class);
       // AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.spring.ioc");
      //  String s[]=context.getBeanDefinitionNames();
      //  Arrays.stream(s).forEach(System.out::println);
      //  Hello h=(Hello) context.getBean("hello1");
        String[] s=(String[]) context.getBean("names");
        Arrays.stream(s).forEach(System.out::println);
        Collecction c=context.getBean(Collecction.class);
        System.out.println("..."+c.getNames());
        context.registerShutdownHook();
        //h.sayHello();
    }
}
