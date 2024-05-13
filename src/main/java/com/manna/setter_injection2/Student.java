package com.manna.setter_injection2;

public class Student {
	private int id;
	private String name;
	private Education education;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println(education.show());
	}
}