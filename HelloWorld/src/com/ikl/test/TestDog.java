package com.ikl.test;

public class TestDog {
	private int weight;
	private int age;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void getStatus() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age + " years old");
		System.out.println("Weight : " + this.weight + "kg");
	}
	
	public static void main(String arg[]) {
		TestDog testDog = new TestDog();
		testDog.setName("Dog A");
		testDog.setAge(5);
		testDog.setWeight(10);
		testDog.getStatus();
	}
}
