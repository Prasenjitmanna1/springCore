package com.manna.autowiring_byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\manna\\autowiring_byType\\ApplicationContext.xml");
		Student student = context.getBean("student", Student.class);
		student.displayProfile();
	}
}