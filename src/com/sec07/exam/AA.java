package com.sec07.exam;

public class AA {
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	//protected = default + 상속 시 우리끼리
	protected int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getHap() {
		return getA() + getB();
	}

}
