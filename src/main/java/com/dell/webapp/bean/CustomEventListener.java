package com.dell.webapp.bean;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener{

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(" --- Event is handled : "+event.toString()); 
	}

}
