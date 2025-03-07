package com.sec05;

public class c_Array {

	public static void main(String[] args) {
		Test();

	}
	
	public static void Test() {
		// 1) 배열선언 생성 출력 확인 - 나열형 상수 값으로 동적할당
		int ar02[] = new int[] {10, 20, 30, 40, 50};
		
		// 2) 출력
		Prn(ar02);

		// 3) 역순으로 출력
		reversePrn(ar02);
		
	}
	
	public static void Prn(int[]ar) {//int [] ar = ar; -> 주소참조
		System.out.println("===반복 for문 출력===");
		for (int i = 0 ; i < ar.length ; i++) {
			System.out.printf("%d ",ar[i]);
		}
		System.out.println();
	}
	
	public static void reversePrn(int[]ar) {//int [] ar = ar; -> 주소참조
		System.out.println("===반복 for문 역순 출력===");
		for (int i = (ar.length - 1) ; i >= 0 ; i--) {
			System.out.printf("%d ",ar[i]);
		}
		System.out.println();
	}

}
