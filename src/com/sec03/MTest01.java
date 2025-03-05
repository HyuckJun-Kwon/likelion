package com.sec03;

public class MTest01 {

	public static void main(String[] args) {
		U_Address a1 = new U_Address();
		U_Address b1 = new U_Address();
		U_Address c1 = new U_Address();
		
		a1.setName("홍길동");
		a1.setAddr("서울");
		a1.setTel("02-000-0000");
		
		b1.setName("정길동");
		b1.setAddr("인천");
		b1.setTel("031-000-0000");
		
		c1.setName("최길동");
		c1.setAddr("부산");
		c1.setTel("051-000-0000");
		
		System.out.println("======================주소록======================");
		//System.out.printf("|이름 : %s | 주소 : %s | 전화번호 : %s |\n", a1.getName(), a1.getAddr(), a1.getTel());
		//System.out.printf("|이름 : %s | 주소 : %s | 전화번호 : %s|\n", b1.getName(), b1.getAddr(), b1.getTel());
		//System.out.printf("|이름 : %s | 주소 : %s | 전화번호 : %s|\n", c1.getName(), c1.getAddr(), c1.getTel());
		a1.Prn();
		b1.Prn();
		c1.Prn();

	}

}
