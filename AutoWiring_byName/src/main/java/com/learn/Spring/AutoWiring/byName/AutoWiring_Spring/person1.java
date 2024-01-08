package com.learn.Spring.AutoWiring.byName.AutoWiring_Spring;

public class person1 {
	Mobile1 m;

	public person1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public person1(Mobile1 m) {
		super();
		this.m = m;
	}

	public Mobile1 getM() {
		return m;
	}

	public void setM(Mobile1 m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "person1 [m=" + m + "]";
	}
	

	
}


