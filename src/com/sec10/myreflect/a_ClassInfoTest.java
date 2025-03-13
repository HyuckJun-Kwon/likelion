package com.sec10.myreflect;

import java.lang.reflect.Field;

class My{
	private String name = "홍길동";
	private int a = 10;
}

public class a_ClassInfoTest {

	public static void main(String[] args) throws Exception {
		My m1 = new My();
		Class<?> clazz = m1.getClass();
		
		Field field = clazz.getDeclaredField("name");
		field.setAccessible(true);// private 멤버 접근
		
		//필드 값 변경
		field.set(m1, "김상덕");
		
		System.out.println("변경된 값 : " + field.get(m1));
		
		field = clazz.getDeclaredField("a");
		field.setAccessible(true);// private 멤버 접근
		
		//필드 값 변경
		field.set(m1, 20);
		
		System.out.println("변경된 값 : " + field.get(m1));

	}

}
