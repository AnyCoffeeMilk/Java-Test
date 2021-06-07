package com.ikl.threadTest;

import java.util.*;

public class ThreadTest {
	public static void main(String args[]) {
		ArrayList<Integer> slist = new ArrayList<Integer>();
		Vector<Integer> list = new Vector<Integer>();
		
		for (int i=0;i<10;i++) {
			new Thread() {
				@Override
				public void run() {
					list.add(1);
					System.out.println(list);
				}
			}.start();
		}
		
		
	}
}