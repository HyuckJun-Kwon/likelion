package work.com.workshop01;

public class ex07 {

	public static void main(String[] args) {
		 char ch = 'G'; // 다른 문자로 변경하여 테스트 가능

		 // 결과 출력
		 printResult(ch);
		 }
		 
		 
	public static boolean isAlphabet(char ch) {
		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
		}
	
	public static void printResult(char ch) {
		 String result = isAlphabet(ch)
		 ? "입력한 문자 '" + ch + "'는 영문자입니다."
		 : "입력한 문자'" + ch + "'는 영문자가 아닙니다.";
		 System.out.println(result);
		 
	}

}
