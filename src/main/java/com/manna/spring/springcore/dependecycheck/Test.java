package com.manna.spring.springcore.dependecycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new	ClassPathXmlApplicationContext(
				"com/manna/spring/springcore/dependecycheck/config.xml");
		Prescription prescription = (Prescription) ctx.getBean("prescription");
		System.out.println(prescription);
		
		
	}

}
