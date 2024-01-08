package com.learn.Spring.AutoWiring.byConstructor.AutoWiring_Project;

public class Car {
	Driver d;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Driver d) {
		super();
		this.d = d;
	}

	public Driver getD() {
		return d;
	}

	public void setD(Driver d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Car [d=" + d + "]";
	}
	

}
