package com.sec07.mytest;

public class MTest01 {
	public static void main(String[] args) {
		DD_work d1 = new DD_work();
		System.out.println("초기값 확인 : " + d1.getRes());
		prn(d1);
		BB_work b1 = new BB_work();
		prn02(b1);
	}
	
	public static void prn(DD_work res) {//정적 바인딩
		res.setA(100);
		res.setB(20);
		res.setC(1);
		res.setD(1);
		System.out.println(res.getRes());
	}
	public static void prn02(AA_work res) {//동적 바인딩
		res.setA(100);
		res.setB(20);
		((BB_work)res).setC(1);
		((DD_work)res).setD(1);
		System.out.println(((DD_work)res).getRes());
	}
}
