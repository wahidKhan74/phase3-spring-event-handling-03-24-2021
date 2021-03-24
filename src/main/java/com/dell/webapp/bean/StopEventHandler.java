package com.dell.webapp.bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopEventHandler implements ApplicationListener<ContextStoppedEvent>{

	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("--- Context Stopped Event is Received ! --- ");
	}

}
