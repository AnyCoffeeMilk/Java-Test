package com.ikl.test;

public class Child extends Parent {
	private void play() {
		System.out.println("Playing...");
	}
	public void getParentAge() {
		System.out.println("From Child, parent's age is " + super.age);
	}
	
	public static void main(String args[]) {
		Child child = new Child();
		Parent parent = new Parent();
		child.play();
		parent.work();
		child.getParentAge();
		parent.getAge();
	}
}
