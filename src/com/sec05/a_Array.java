package com.sec05;

public class a_Array {

	public static void main(String[] args) {
		Test();

	}
	
	public static void Test() {
		//1) 배열선언 생성 출력 확인
		// '나열형 값을 선언과 동시에 직대입했다' 표현
		int[] ar = {10, 20, 30, 40, 50};
		int ar02[] = {10, 20, 30, 40, 50};
		System.out.println("===ar출력===");
		for (int i = 0; i<5 ; i++) {
			System.out.println(ar[i]);
		}
		//제네릭 for문 출력
		System.out.println("===ar출력-제너릭 for===");
		for(int res : ar) {
			System.out.println(res);
		}
	}

}
