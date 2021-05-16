package com.ikl.test;

public class Animal {
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void getName() {
		System.out.println("Name: " + this.name);
	}
	
	public void eat() {
		System.out.println("Eating...");
	}
}