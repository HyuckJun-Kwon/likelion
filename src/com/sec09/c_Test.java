package com.sec09;

import java.util.Scanner;

public class c_Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = 0;
		try {
			r  = scanner.nextInt();
		}catch(java.util.InputMismatchException IE) {
			System.out.println("예외처리 실행 : 0으로 재 초기화");
			r = 0;
		}
		
		System.out.println("r = " + r);
		
	}

}
