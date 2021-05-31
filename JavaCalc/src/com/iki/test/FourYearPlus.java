package com.iki.test;

import java.time.*;

public class FourYearPlus {
	public static void main(String args[]) {
		for (int i = 2000; i < 2100; i++) {
			if (i % 4 == 0) {
				LocalDate date = LocalDate.of(i, Month.FEBRUARY, 29);
				System.out.println(date.getDayOfWeek());
			}
		}
	}
}
