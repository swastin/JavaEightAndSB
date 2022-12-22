package com.swastin.JavaReflection.ClassDemo;

public class Student {
	
	public String name;
	 public int id;
	 int rollnumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public Student(String name, int id, int rollnumber) {
		super();
		this.name = name;
		this.id = id;
		this.rollnumber = rollnumber;
	}
	public Student() {
		super();
	}
	
public void print() {
	
System.out.println(this.id+""+this.name+this.rollnumber);	
}
}
