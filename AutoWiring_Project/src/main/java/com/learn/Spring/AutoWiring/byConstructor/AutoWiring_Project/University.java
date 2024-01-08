package com.learn.Spring.AutoWiring.byConstructor.AutoWiring_Project;

public class University {
	professor p;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(professor p) {
		super();
		this.p = p;
	}

	public professor getP() {
		return p;
	}

	public void setP(professor p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "University [p=" + p + "]";
	}
	

}
