package com.sec07.mytest;

public class MTest {
	public static void main(String[] args) {
		//new AA_work();
		//new BB_work();
		//new DD_work();
		
		AA_work a1 = new DD_work();
		//AA_work(), BB_work(), DD_work() 객체를 한방에 생성함
		//근데 a1이 AA_work를 참조하도록 생성 
		
		BB_work b1 = new DD_work();
		//AA_work(), BB_work(), DD_work() 객체를 한방에 생성함
		//근데 b1이 BB_work를 참조하도록 생성
		
		BB_work b2 = new BB_work();
		//AA_work(), BB_work() 객체를 생성
		
		AA_work c1 = new BB_work();;
		//AA_work(), BB_work() 객체를 생성
		
		check_instance(a1);
		check_instance(b2);
	
	}
	
	public static void check_instance(AA_work obj) {
		if (obj instanceof DD_work) {
			System.out.println("객체는 DD 클래스의 인스턴스이다.");
		}else if (obj instanceof BB_work) {
			System.out.println("객체는 BB 클래스의 인스턴스이다.");
		}else {
			System.out.println("객체는 AA 클래스의 인스턴스이다.");
		}
	}

}
