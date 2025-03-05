package com.sec03;
class MyAddress{
	private String name;
	private String addr;
	private String tel;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getTel() {
		return tel;
	}
	
	
}
public class MTest01 {

	public static void main(String[] args) {
		MyAddress a1 = new MyAddress();
		MyAddress b1 = new MyAddress();
		MyAddress c1 = new MyAddress();
		
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
		System.out.printf("|이름 : %s | 주소 : %s | 전화번호 : %s |\n", a1.getName(), a1.getAddr(), a1.getTel());
		System.out.printf("|이름 : %s | 주소 : %s | 전화번호 : %s|\n", b1.getName(), b1.getAddr(), b1.getTel());
		System.out.printf("|이름 : %s | 주소 : %s | 전화번호 : %s|\n", c1.getName(), c1.getAddr(), c1.getTel());

	}

}
