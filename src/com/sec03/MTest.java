package com.sec03;
class Test {
	private int a; // 멤버변수 은닉
	private int b; // 멤버변수 은닉

	//seter - void (값을 전달 및 변경하는 것이므로 리턴을 안함)
	public void setA(int a){
		this.a = a; //은닉된 멤버변수를 오픈된 메소드를 통해 값 전달 및 변경
	}

	public void setB(int b){
		this.b = b; //은닉된 멤버변수를 오픈된 메소드를 통해 값 전달 및 변경
	}

	//getter
	public int getA(){
		return a; //메소드에 전달한 값을 리턴
	}
	
	public int getB(){
		return b; //메소드에 전달한 값을 리턴
	}
}

public class MTest {

	public static void main(String[] args) {
		Test t = new Test(); //객체 생성
		
		t.setA(5); //setter 이용 멤버변수에 값 전달
		t.setB(5); //setter 이용 멤버변수에 값 전달
		
		System.out.println(t.getA()); // getter 이용 값 return
		System.out.println(t.getB()); // getter 이용 값 return
		
		//메모리 할당 객체 생성
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		//할당된 주소 확인
		System.out.println(t1+t1.toString());//t1 = t1.toString()
		System.out.println(t2+t2.toString());//t2 = t2.toString()
		System.out.println(t3+t3.toString());//t3 = t3.toString()
		
		//할당된 초기값 확인 -> 멤버 변수는 객체가 생성될 때 생성자에 의해서 초기값 대임 후 메모리 할당
		System.out.println(t1.getA());
		System.out.println(t2.getA());
		System.out.println(t3.getA());
	}
}
