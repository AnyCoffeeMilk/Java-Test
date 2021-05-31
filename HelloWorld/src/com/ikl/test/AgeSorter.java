package com.ikl.test;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class AgeSorter {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] a = {20, 31, 15, 17, 30};
		Integer[] b = Arrays.copyOf(a, a.length);
		
		String str = "";
		System.out.println("Enter 1 or 0, enter 'q' to quit.");
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		while(!str.equals("q")) {
			str = br.readLine();
			if (str.equals("1")) {
				for (int i: a) {
					System.out.print(i + "\t");
				}
			}
			else if (str.equals("0")) {
				for (int j: b) {
					System.out.print(j + "\t");
				}
			}
		}
	}
}
