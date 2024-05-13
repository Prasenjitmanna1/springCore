package com.manna.StereotypeAnno2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\manna\\StereotypeAnno2\\ApplicationContext.xml");
		StudentController controller = (StudentController) context.getBean("studentController");
		System.out.println(controller.createNewStudent());
	}
}