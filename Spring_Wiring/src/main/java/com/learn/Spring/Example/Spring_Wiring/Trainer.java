package com.learn.Spring.Example.Spring_Wiring;

public class Trainer {
	int T_id;
	String T_name;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int t_id, String t_name) {
		super();
		T_id = t_id;
		T_name = t_name;
	}
	public int getT_id() {
		return T_id;
	}
	public void setT_id(int t_id) {
		T_id = t_id;
	}
	public String getT_name() {
		return T_name;
	}
	public void setT_name(String t_name) {
		T_name = t_name;
	}
	@Override
	public String toString() {
		return "Trainer [T_id=" + T_id + ", T_name=" + T_name + "]";
	}
	

}
