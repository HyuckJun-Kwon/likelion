package com.sec01.exam;

public class i_exam {
	public static int getA() {
		return 100;
	}
	public static char getCh() {
		return 'A';
	}
	public static double getDouble() {
		return 98.1;
	}

	public static void main(String[] args) {
		int a = getA();
		System.out.println("a = " + a);
		System.out.println("a = " + getA());
		
		System.out.println(getCh());
		System.out.println(getDouble());
		
	}

}
