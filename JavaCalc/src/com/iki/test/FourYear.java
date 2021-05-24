package com.iki.test;

public class FourYear {
	public static void main(String args[]) {
		for (int i = 2000; i < 2101; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
	}
}
