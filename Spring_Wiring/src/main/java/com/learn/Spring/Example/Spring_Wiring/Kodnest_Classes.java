package com.learn.Spring.Example.Spring_Wiring;

public class Kodnest_Classes
{
	Trainer tr;

	public Kodnest_Classes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kodnest_Classes(Trainer tr) {
		super();
		this.tr = tr;
	}

	public Trainer getTr() {
		return tr;
	}

	public void setTr(Trainer tr) {
		this.tr = tr;
	}

	@Override
	public String toString() {
		return "Kodnest_Classes [tr=" + tr + "]";
	}
	

}
