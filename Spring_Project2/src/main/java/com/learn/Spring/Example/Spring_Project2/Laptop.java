package com.learn.Spring.Example.Spring_Project2;

public class Laptop {
	int serial_number;
	String Brand;
	int price;
	public Laptop() {
	}
	public Laptop(int serial_number, String brand, int price) {
		super();
		this.serial_number = serial_number;
		Brand = brand;
		this.price = price;
	}
	public int getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(int serial_number) {
		this.serial_number = serial_number;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [serial_number=" + serial_number + ", Brand=" + Brand + ", price=" + price + "]";
	}
	
	

}
