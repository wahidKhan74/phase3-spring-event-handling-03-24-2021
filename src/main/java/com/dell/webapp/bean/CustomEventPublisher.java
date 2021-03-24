package com.dell.webapp.bean;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware{

	public ApplicationEventPublisher publisher;
	
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	// method to publish custom event
	public void publish() {
		CustomEvent cevent = new CustomEvent(this);
		this.publisher.publishEvent(cevent);
	}

}
