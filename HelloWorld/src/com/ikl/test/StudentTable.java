package com.ikl.test;

import java.util.*;

public class StudentTable {
	public HashMap<String, String> table = new HashMap<String, String>();
	public StudentTable(String name, String num, String classNum, String eng, String ch, String math) {
		table.put("name", name);
		table.put("num", num);
		table.put("classNum", classNum);
		table.put("eng", eng);
		table.put("ch", ch);
		table.put("math", math);
	}
	public static <T> void main(String args[]) {
		StudentTable studentA = new StudentTable("Jayden", "1", "123", "90", "95", "99");
		System.out.println(studentA.table);
	}
}
