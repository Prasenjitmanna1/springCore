package com.manna.setter_injection2;

public class Education {
	private String degree;
	private String course;
	private String subject;

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String show() {
		return degree + " " + course + " " + subject;
	}
}