package com.learn.Spring.Example.Annotations.AutoWiring_Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
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
