package com.sec03;

public class MyClass {
	private int a;
	
	public MyClass(){
		System.out.println("기본생성자");
	}
	public MyClass(int a){
		this.a = a;
		System.out.println("오버로드 생성자" + this.a);
	}

	public static void main(String[] args) {
		System.out.println(new MyClass());
		MyClass m = new MyClass(200);
	

	}

}
