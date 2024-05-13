package com.manna.constructor_injection2;

import java.util.Iterator;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<String> allied;

	public Student() {
		System.out.println("No Data");
	}

	public Student(int id, String name, List<String> allied) {
		this.id = id;
		this.name = name;
		this.allied = allied;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("Allied subjects are :");
		Iterator<String> itr = allied.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}