package com.sec07.mytest;

public class DD_work extends BB_work {
	private int d;
	
	public DD_work() {
		System.out.println("DD' 기본 생성자.");
	}

	public DD_work(int i, int j, int k, int l) {
		super(i,j,k);
		this.d = l;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	@Override
	public int getRes() {		
		return super.getRes() * this.getD();
	}

}

