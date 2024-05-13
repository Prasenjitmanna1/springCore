package com.manna.StereotypeAnno2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentController")
public class StudentController {
	@Autowired
	StudentManager manager;

	public StudentDTO createNewStudent() {
		return manager.createNewStudent();
	}
}