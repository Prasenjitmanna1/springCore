package com.manna.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/manna/spring/springcore/config.xml");
		Employee emp  = (Employee) ctx.getBean("emp");
		System.out.println("Employee Id:"+emp.getId());
		System.out.println("Employee Name:"+emp.getName());
	}
}
