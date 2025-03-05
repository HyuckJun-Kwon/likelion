package work.com.workshop01;

public class ex01 {

	public static void main(String[] args) {
		int i = 100;
		double d = 3.14;
		char c = 'A';
		boolean b = true;
		
		
		System.out.println("정수형 변수의 값은 " + i + "이며, 자료형은 " + ((Object)i).getClass().getSimpleName() +"입니다.");
		System.out.println("실수형 변수의 값은 " + d + "이며, 자료형은 " + ((Object)d).getClass().getSimpleName() +"입니다.");
		System.out.println("문자형 변수의 값은 " + c + "이며, 자료형은 " + ((Object)c).getClass().getSimpleName() +"입니다.");
		System.out.println("논리형 변수의 값은 " + b + "이며, 자료형은 " + ((Object)b).getClass().getSimpleName() +"입니다.");

	}

}
