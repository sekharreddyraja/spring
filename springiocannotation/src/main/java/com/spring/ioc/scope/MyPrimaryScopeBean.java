package com.spring.ioc.scope;

import java.time.LocalDateTime;

public class MyPrimaryScopeBean {

	private String dateTimeString=LocalDateTime.now().toString();
	
	public String getDateTime() {
		return dateTimeString;
	}
}
