package com.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientTest {

	@Autowired
	Hello hello;
	
}
