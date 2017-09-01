package com.spring.ioc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class Collecction {

	private String[] names;
	private List<String> emails;
	private Map<String,String> details;
	
	public String[] getNames() {
		return names;
	}
	@Autowired
	public void setNames(String[] names) {
		this.names = names;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public Map<String, String> getDetails() {
		return details;
	}
	public void setDetails(Map<String, String> details) {
		this.details = details;
	}
	
}
