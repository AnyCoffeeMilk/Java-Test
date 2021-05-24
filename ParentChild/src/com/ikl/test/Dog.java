package com.ikl.test;

public class Dog {
	private String name;
	private String color;
	private int age;
	
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void setInfo(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void getInfo() {
		System.out.println("I'm " + name + "\n" + "Color: " + color + "\n" + "Age: " + age + "\n");
	}
	public void eat() {
		System.out.println("Eating...");
	}
	public void sleep() {
		System.out.println("Sleeping");
	}
	public static void main(String args[]) {
		Dog dog1 = new Dog("DogA", "red", 20);
		dog1.getInfo();
		Dog dog2 = new Dog("DogB", "yellow", 200);
		dog2.getInfo();
		dog1.setInfo("Dog1", "blue", 10);
		dog2.setInfo("Dog2", "green", 100);
		dog1.getInfo();
		dog2.getInfo();
		dog1.eat();
		dog2.sleep();
	}
}
