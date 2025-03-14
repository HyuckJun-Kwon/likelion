package com.sec12.labmbda;

public class LambdaTest {
	
	@FunctionalInterface // 함수형 인터페이스 강제 체크
	interface Fun01{
		public String prn(String name);//매개인자 메소드
	}
	
	interface Fun02{
		public String prn02();//매개인자 없는 메소드
	}
	
	interface Fun03{
		public void say(String name);
	}
	
	public static void main(String[] args) {
		Fun01 m_name = name -> "hello!" + name;
		//처음 (name)의 ()를 생략,  -> 는 return을 포함
		
		System.out.println("m_name : " + m_name.prn(" 홍길동"));

		Fun02 m_test = () -> "Come on!";
		System.out.println(m_test.prn02());
		
		Fun03 m_test03 = (name) -> System.out.println("hello!" + name);
		m_test03.say(" 강호동");
		
	}

}
