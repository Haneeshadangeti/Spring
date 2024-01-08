package com.learn.Spring.Example.Spring_Project1;

public class Student_Spring {
	int rollno;
	String name;
	int yop;
	
	public Student_Spring() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student_Spring(int rollno, String name, int yop) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.yop = yop;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	@Override
	public String toString() {
		return "Student_Spring [rollno=" + rollno + ", name=" + name + ", yop=" + yop + "]";
	}
	
	

}
