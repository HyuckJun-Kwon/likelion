package com.sec05;

public class b_Array {

	public static void main(String[] args) {
		Test();

	}
	
	public static void Test() {
		// 1) 배열선언 생성 출력 확인 - 동적할당
		int ar02[] = new int[10];
		
		//2) 배열의 주소를 넘겨서 메소드에서 출력 해보자.
		Prn(ar02);
		
		//3) 값을 채우자
		for (int i = 0 ; i < ar02.length ; i ++) {
			ar02[i] = i + 1;
		}
		
		//4) 값 채우고 다시 호출
		Prn(ar02);
		
		//5) 역순으로 출력
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
