package com.learn.Spring.AutoWiring.byConstructor.AutoWiring_Constructor;

public class Person 
{
	Mobile m;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Mobile m) {
		super();
		this.m = m;
	}

	public Mobile getM() {
		return m;
	}

	public void setM(Mobile m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Person [m=" + m + "]";
	}
	
	

}
