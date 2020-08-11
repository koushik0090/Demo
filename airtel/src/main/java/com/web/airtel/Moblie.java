package com.web.airtel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Moblie {

	private static ApplicationContext context;

	public static void main(String[] args) {
     
		context = new ClassPathXmlApplicationContext("beans.xml");
		Airtel s=context.getBean("service",Airtel.class);
		s.service();
	}

}
