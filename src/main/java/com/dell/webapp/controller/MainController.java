package com.dell.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dell.webapp.bean.CustomEventPublisher;

@Controller
public class MainController {

	@RequestMapping(value="/customevent" , method=RequestMethod.GET)
	public String customEventMapping(ModelMap map) {
		
		// create & publish custom event
		ApplicationContext context = new ClassPathXmlApplicationContext("main-servlet.xml");
		
		CustomEventPublisher publisherBean = (CustomEventPublisher) context.getBean("customEventPublisher");
		
		publisherBean.publish();
		publisherBean.publish();
		
		// return a response
		return "customEvent";
	}
}
