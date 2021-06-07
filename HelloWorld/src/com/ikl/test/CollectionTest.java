package com.ikl.test;

import java.util.*;

public class CollectionTest {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Hey");
		list.add("Hello");
		list.remove(1);
		list.add("hi");
		for (String i : list) {
			System.out.printf("From List: %s%n", i);
		}
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		for (int i : set) {
			System.out.printf("From Set: %s%n", i);
		}
		Queue<Double> queue = new LinkedList<Double>();
		queue.add(1.1);
		queue.add(2.2);
		queue.remove();
		queue.add(3.3);
		for (double i : queue) {
			System.out.printf("From Queue: %s%n", i);
		}
	}
}
