package com.ikl.test;

import com.ikl.test.drinks.*;

public class Human {
	private int age;
	private String name;
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void use(Cup cup) {
		cup.drink(this.name, this.age);
	}
	public static void main(String args[]) {
		Human Jayden = new Human("Jayden", 16);
		Cup cupA = new Cup("Cup A");
		Tea tea = new Tea();
		Beer beer = new Beer();
		cupA.fill(tea);
		Jayden.use(cupA);
		cupA.pour();
		Jayden.use(cupA);
		cupA.fill(beer);
		Jayden.use(cupA);
	}
}
