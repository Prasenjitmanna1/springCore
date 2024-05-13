package com.manna.StereotypeAnno2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentManager")
public class StudentManagerImpl implements StudentManager {
	@Autowired
	StudentDAO dao;

	public StudentDTO createNewStudent() {
		return dao.createNewStudent();
	}
}