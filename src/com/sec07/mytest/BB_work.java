package com.sec07.mytest;

public class BB_work extends AA_work{
	private int c;
	
	public BB_work() {
		System.out.println("BB' 기본 생성자.");
	}

	public BB_work(int i, int j, int k) {
		super(i,j);
		this.c = k;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public int getRes() {		
		return  getHap()-getC(); 
	}

}
