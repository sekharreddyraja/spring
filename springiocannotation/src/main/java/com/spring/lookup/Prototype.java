package com.spring.lookup;

import java.time.LocalDateTime;

public class Prototype {

	private String dateString=LocalDateTime.now().toString();
	
	public String getTime() {
		return dateString;
	}
}
