package com.test;
//static final, abstract 메소드, default, static 메소드
//interface 생성자 없다, new 할 수 없다, 다중 구현한다.
public interface IAA {
	int a = 10;
	//public static final int a = 10;
	//변수 선언 시에 선언 이후 다음 구문에서 초기화 불가, 선언과 동시에 초기값
	
	public static final int b = 10;
	
	void prn();
	
	public abstract void disp();
	
	default void view() {//재정의 가능
		System.out.println(a);
	}
	
	static void view02() {//재정의 불가
		System.out.println(a);
	}
}
