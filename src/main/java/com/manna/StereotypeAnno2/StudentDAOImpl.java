package com.manna.StereotypeAnno2;

import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO {
	public StudentDTO createNewStudent() {
		StudentDTO s = new StudentDTO();
		s.setId(222);
		s.setFirstName("Stefan");
		s.setLastName("Edberg");
		return s;
	}
}