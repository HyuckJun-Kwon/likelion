package com.sec02.exam;

public class c_Nan {

	public static void main(String[] args) {
		//자바에서는 nan 처리를 해주는 다양한 메소드를 제공한다.
		//java.lang.Double 메소드에서 처리
		double x = 0.0/0.0;
		double x1 = Math.sqrt(-1);
		double x2 = Math.log(-1);
		System.out.println(x + "\t" + x1 + "\t" + x2);

	}

}
