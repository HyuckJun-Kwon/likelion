package com.sec09;

public class a_Test {
	public static void main(String[] args) {
		int  a = 100;
		int b = 5;
		int res = 0;
		try {
			res = a / b;
		}catch(ArithmeticException AE){
			b = 2;
			System.out.println("예외처리 했어 : " + AE.getMessage());
		}catch(RuntimeException RE) {
			System.out.println("또 다른 경우 RuntimeException");
		}catch(Exception E) {
			System.out.println("또 또 다른 경우 Exception");
		}finally {
			System.out.println("반드시 수행해야 할 구문");
		}
		
		System.out.printf("a = %d b = %d res = %d\n", a, b, res);
	}

}
