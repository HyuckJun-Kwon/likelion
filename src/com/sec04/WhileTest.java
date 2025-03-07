package com.sec04;

public class WhileTest {
	public static void test01() {
		int i = 1;
		System.out.println("Countdown start!");

		while (i <= 5) {
			System.out.printf("%5d", i);
			i++;
		}
		System.out.println("\n    end i = " + i);
	}
	
	public static void test02() {
		int i = 1; //지역변수 초기화
		
		while (i <= 5){ //I가 5 이하이면 루프 실행 I가 5보다 커지면 루프 종료**
			i++; //I값 증가**
			System.out.printf("%5d",i); //I 출력**
		}
		System.out.println("\n    end i = " + i);
	}
	
	public static void test03() {
		int i = 1; //지역변수 초기화
		int cnt = 0;
		while (i <= 100){
			
			if (i % 2 == 0) {
				System.out.printf("%d ",i);
				cnt ++;
			}
			i++;
		}
		System.out.println("\nend i = " + i + "\nEvenNumberCnt = " + cnt);	
	}
	public static void test04() {
		int i = 1; //지역변수 초기화
		int heart = 0;
		while (i <= 100){
			
			if (i % 5 == 0) {
				System.out.println("♥ ");
				heart++;
			} else {
				System.out.printf("%d ",i);
			}
			i++;
		}
		System.out.println("end = " + i + " HeartCount = " + heart);	
	}
	
	
	public static void main(String[] args) {
		//test01();
		//test02();
		//test03();
		test04();

	}	


}

