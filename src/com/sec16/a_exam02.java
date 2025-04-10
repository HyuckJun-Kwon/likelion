package com.sec16;

public class a_exam02 extends Thread{
	
	public a_exam02(String threadName) {
		super(threadName);
	}

	public static void main(String[] args) {
		a_exam02 t1 = new a_exam02("고양이");
		a_exam02 t2 = new a_exam02("강아지");
		t1.setPriority(9);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for (int i = 1 ; i <= 50 ; i++) {
			System.out.println("스레드 => " + getName() + i);
		}
		
		
	}
}
