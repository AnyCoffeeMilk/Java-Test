package com.ikl.test;

public abstract class Drinks {
	private String name;
	private int ageLimit;
	public Drinks(String name, int ageLimit) {
		this.name = name;
		this.ageLimit = ageLimit;
	}
	public String getName() {
		return this.name;
	}
	public int getAgeLimit() {
		return this.ageLimit;
	}
}
