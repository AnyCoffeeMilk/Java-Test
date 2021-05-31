package com.ikl.test;

import java.io.*;

public class CreateFile {
	public static void gen(String tmp, int counter) {
		if (counter == 3) {
			File f1 = new File(tmp+"1/abc.txt");
			File f2 = new File(tmp+"2/abc.txt");
			File f3 = new File(tmp+"3/abc.txt");
			f1.mkdir();
			f2.mkdir();
			f3.mkdir();
			return;
		}
		counter++;
		tmp = tmp + "hi";
		File f1 = new File(tmp+"1/");
		File f2 = new File(tmp+"2/");
		File f3 = new File(tmp+"3/");
		f1.mkdir();
		f2.mkdir();
		f3.mkdir();
		gen(tmp+"1/", counter);
		gen(tmp+"2/", counter);
		gen(tmp+"3/", counter);
	}
	public static void main(String args[]) {
		gen("C:/Users/ACER/Desktop/Java-Test/output/", 0);
	}
}
