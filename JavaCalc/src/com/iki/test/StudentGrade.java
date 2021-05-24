package com.iki.test;

public class StudentGrade {
	public static void main(String args[]) {
		int[] s = {100, 90, 50, 80, 80, 70, 100, 90, 30, 60};
		int tmp = 0;
		for (int i = 0; i < 10; i++) {
			int a = s[i];
			switch(a) {
				case 100:
					System.out.println(i + ": A");
					break;
				case 90:
					System.out.println(i + ": A-");
					break;
				case 80:
					System.out.println(i + ": B+");
					break;
				case 70:
					System.out.println(i + ": B");
					break;
				case 60:
					System.out.println(i + ": B-");
					break;
				default:
					System.out.println(i + ": Not Pass");
					break;
			}
			tmp += a;
		}
		int avg = tmp / 10;
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (s[i] >= avg) {
				count++;
			}
		}
		System.out.println("Above Avg: " + count);
		System.out.println("Below Avg: " + (10 - count));
	}
}
