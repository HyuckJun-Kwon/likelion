package com.sec03;

public class U_Address {
	private String name;
	private String addr;
	private String tel;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return addr;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTel() {
		return tel;
	}

	public void Prn() {
		System.out.printf("| %s | %s | %s |\n", this.getName(), this.getAddr(), this.getTel());
	}
	
}