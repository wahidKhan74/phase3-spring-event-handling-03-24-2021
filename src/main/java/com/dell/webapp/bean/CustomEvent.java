package com.dell.webapp.bean;

import org.springframework.context.ApplicationEvent;

// create a custom event
public class CustomEvent  extends ApplicationEvent{

	public CustomEvent(Object source) {
		super(source);
	}
	
	// override toString()	
	public String toString(){
		return "This is a custom event";
	}
}


