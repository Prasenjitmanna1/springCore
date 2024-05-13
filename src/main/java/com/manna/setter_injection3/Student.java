package com.manna.setter_injection3;

import java.util.Iterator;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<String> allied;

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

	public List<String> getAllied() {
		return allied;
	}

	public void setAllied(List<String> allied) {
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
