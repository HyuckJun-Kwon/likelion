package work.com.workshop01;

public class ex03 {

	public static void main(String[] args) {
		int num = 45678;
		
		int result = (((num / 1000) << 10) * 1000) / 1024;
		
		System.out.println("기존 숫자: " + num);
        System.out.println("비트 연산 후 변환된 숫자: " + result);

	}

}
