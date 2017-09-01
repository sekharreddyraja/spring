package com.spring.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Sigleton {

	public void showMessage() {
		Prototype p=getPrototype();
		p.getTime();
	}
	
	@Lookup
	public Prototype getPrototype() {
		return null;
	}
}
