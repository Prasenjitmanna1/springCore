package com.manna.constructor_injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com\\manna\\constructor_injection\\ApplicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student student = (Student) factory.getBean("studentbean");
		student.displayInfo();
	}
}