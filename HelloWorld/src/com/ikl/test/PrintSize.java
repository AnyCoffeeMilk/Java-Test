package com.ikl.test;

public class PrintSize {
	
	public static void main(String args[]) {
		System.out.println("Byte: " + Byte.SIZE + "(" + Byte.MAX_VALUE + " to " + Byte.MIN_VALUE + ")");
		System.out.println("Int: " + Integer.SIZE + "(" + Integer.MAX_VALUE + " to " + Integer.MIN_VALUE + ")");
		System.out.println("Float: " + Float.SIZE + "(" + Float.MAX_VALUE + " to " + Float.MIN_VALUE + ")");
		System.out.println("Double: " + Double.SIZE + "(" + Double.MAX_VALUE + " to " + Double.MIN_VALUE + ")");
		System.out.println("Long: " + Long.SIZE + "(" + Long.MAX_VALUE + " to " + Long.MIN_VALUE + ")");
		System.out.println("Short: " + Short.SIZE + "(" + Short.MAX_VALUE + " to " + Short.MIN_VALUE + ")");
		System.out.println("Char: " + Character.SIZE + "(" + Character.MAX_VALUE + "to " + Character.MIN_VALUE + ")");
	}
}
