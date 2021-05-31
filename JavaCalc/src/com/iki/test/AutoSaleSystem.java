package com.iki.test;

import java.io.*;

public class AutoSaleSystem{
	public int money;
	int m1000;
	int m500;
	int m100;
	int m50;
	int m10;
	int m5;
	int m2;
	int m1;
	int m05;
	int m02;
	int m01;
	
	public AutoSaleSystem(int m, String[] a) {
		this.money = m;
		this.m1000 = Integer.parseInt(a[0]);
		this.m500 = Integer.parseInt(a[1]);
		this.m100 = Integer.parseInt(a[2]);
		this.m50 = Integer.parseInt(a[3]);
		this.m10 = Integer.parseInt(a[4]);
		this.m5 = Integer.parseInt(a[5]);
		this.m2 = Integer.parseInt(a[6]);
		this.m1 = Integer.parseInt(a[7]);
		this.m05 = Integer.parseInt(a[8]);
		this.m02 = Integer.parseInt(a[9]);
		this.m01 = Integer.parseInt(a[10]);
	}
	public void calc(int p) {
		int money = this.money;
		int price = p;
		
		int a1000 = m1000;
		int a500 = m500;
		int a100 = m100;
		int a50 = m50;
		int a10 = m10;
		int a5 = m5;
		int a2 = m2;
		int a1 = m1;
		int a05 = m05;
		int a02 = m02;
		int a01 = m01;
		
		price = money - price;
		this.money = price;
		while (price > 0) {
			if (Math.floor(price / 1000) > 0) {
				m1000 -= Math.floor(price / 1000);
				price -= 1000 * Math.floor(price / 1000);
			}
			else if (Math.floor(price / 500) > 0) {
				m500 -= Math.floor(price / 500);
				price -= 500 * Math.floor(price / 500);
			}
			else if (Math.floor(price / 100) > 0) {
				m100 -= Math.floor(price / 100);
				price -= 100 * Math.floor(price / 100);
			}
			else if (Math.floor(price / 50) > 0) {
				m50 -= Math.floor(price / 50);
				price -= 50 * Math.floor(price / 50);
			}
			else if (Math.floor(price / 10) > 0) {
				m10 -= Math.floor(price / 10);
				price -= 10 * Math.floor(price / 10);
			}
			else if (Math.floor(price / 5) > 0) {
				m5 -= Math.floor(price / 5);
				price -= 5 * Math.floor(price / 5);;
			}
			else if (Math.floor(price / 2) > 0) {
				m2 -= Math.floor(price / 2);
				price -= 2 * Math.floor(price / 2);
			}
			else if (Math.floor(price / 1) > 0) {
				m1 -= Math.floor(price / 1);
				price -= 1 * Math.floor(price / 1);
			}
			else if (Math.floor(price / 0.5) > 0) {
				m05 -= Math.floor(price / 0.5);
				price -= 0.5 * Math.floor(price / 2);
			}
			else if (Math.floor(price / 0.2) > 0) {
				m02 -= Math.floor(price / 0.2);
				price -= 0.2 * Math.floor(price / 0.2);
			}
			else if (Math.floor(price / 0.1) > 0) {
				m01 -= Math.floor(price / 0.1);
				price -= 0.1 * Math.floor(price / 0.1);
			}
			else {
				break;
			}
		}
		System.out.print("1000: " + (a1000 - m1000) + ", ");
		System.out.print("500: " + (a500 - m500) + ", ");
		System.out.print("100: " + (a100 - m100) + ", ");
		System.out.print("50: " + (a50 - m50) + ", ");
		System.out.print("10: " + (a10 - m10) + ", ");
		System.out.print("5: " + (a5 - m5) + ", ");
		System.out.print("2: " + (a2 - m2) + ", ");
		System.out.print("1: " + (a1 - m1) + ", ");
		System.out.print("0.5: " + (a05 - m05) + ", ");
		System.out.print("0.2: " + (a02 - m02) + ", ");
		System.out.print("0.1: " + (a01 - m01) + ", ");
		System.out.println();
	}
	public void getMoney() {
		System.out.println("Your Money: " + this.money);
	}
	public static void main(String args[]) throws IOException{
		File file = new File("C:/Users/ACER/Desktop/Java-Test/input/abc.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String[] abc = br.readLine().split(",");
		AutoSaleSystem a = new AutoSaleSystem(1000, abc);
		a.calc(14);
		a.getMoney();
		a.calc(53);
		a.getMoney();
	}
}
