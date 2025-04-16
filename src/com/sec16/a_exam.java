package com.sec16;

public class a_exam implements Runnable{

	public static void main(String[] args) {
		System.out.println("========main start========");
		Thread t1 = new Thread(new a_exam(), "고양이");
		Thread t2 = new Thread(new a_exam(), "강아지");
		t1.start();
		t2.start();
		
		System.out.println("========main mid========");
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException i) {
			System.out.println(i);
		}
		System.out.println("========main end========");
		
		//new a_exam().run(); -> 메소드 단위 실행
	}

	@Override
	public void run() {
		for(int i = 0 ; i <= 10 ; i ++) {
			System.out.println("스레드");
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
