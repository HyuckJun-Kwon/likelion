package com.sec13.myio;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private int age, height, weight;

	public Student(String name, int age, int height, int weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	}

	public int getAge() { return age; }
	public int getHeight() { return height; }
	public int getWeight() { return weight; }
	public String getName() { return name; }

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s\n", this.getName(), this.getAge(), this.getHeight(), this.getWeight());
	}

	
	

}
