package com.sec04.exam;

import java.util.Scanner;

public class b_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		String addr = sc.nextLine();
		
		System.out.print("전화번호를 입력하세요 : ");
		String tel = sc.nextLine();
		
		System.out.printf("|이름 : %s |주소 : %s |전화번호 : %s|", name, addr, tel);
		
		/*System.out.print("input i : ");
		int i = sc.nextInt();
		System.out.print("input d : ");
		double d = sc.nextDouble();
		System.out.println("입력받은 값 : " + i);
		System.out.println("입력받은 값 : " + d);
		*/
		
	}

}
