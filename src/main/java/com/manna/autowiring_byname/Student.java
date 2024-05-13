package com.manna.autowiring_byname;

public class Student {
	Course course;

	Student() {
		System.out.println("Student Profile Created");
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	void displayInfo() {
		System.out.println("Student name is John");
	}

	void displayProfile() {
		displayInfo();
		course.displayInfo();
	}
}