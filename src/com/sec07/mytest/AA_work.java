package com.sec07.mytest;

public class AA_work {
	private int a;
	private int b;
	
	public AA_work() {
		System.out.println("AA' 기본 생성자.");
	}

	public AA_work(int i, int j) {
		this.a = i;
		this.b = j;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getHap() {
		return getA() + getB();
	}

}
