package com.ikl.test;

public class Cup extends UseableObj{
	private Drinks drinks;
	private String name;
	public Cup(String name) {
		this.name = name;
	}
	public void use(String name, int age) {
		public void drink() {
			if (this.drinks == null) {
				System.out.printf("%s is empty, please fill something.%n", this.name);
			} else {
				int ageLimit = this.drinks.getAgeLimit();
				String drinksName = this.drinks.getName();
				if (age >= ageLimit) {
					System.out.printf("%s is drinking %s...%n%s is now empty.%n", name, drinksName, this.name);
					this.drinks = null;
				} else {
					System.out.printf("%s is too young to drink %s.%n", name, drinksName);
				}
			}
		}
		public void fill(Drinks drinks) {
			this.drinks = drinks;
			System.out.printf("%s filled %s into %s %n", , this.drinks.getName(), this.name);
		}
		public void pour() {
			if (this.drinks == null) {
				System.out.printf("%s is already empty.%n", this.name);
			} else {
				this.drinks = null;
				System.out.printf("%s is now empty.%n", this.name);
			}
		}
	}
}
