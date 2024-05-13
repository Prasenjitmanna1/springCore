package com.manna.StereotypeAnno1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\manna\\StereotypeAnno1\\ApplicationContext.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}
}