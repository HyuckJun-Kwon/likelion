package com.sec16;

public class a_exam implements Runnable{

	public static void main(String[] args) {
		Thread t1 = new Thread(new a_exam(), "고양이");
		Thread t2 = new Thread(new a_exam(), "강아지");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		System.out.println("스레드");
		
	}
}
