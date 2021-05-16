package com.ikl.test;

public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	
	public static void main(String arg[]) {
		Cat cat = new Cat("Cat A");
		cat.getName();
		cat.setName("Cat B");
		cat.getName();
		cat.eat();
	}
}
