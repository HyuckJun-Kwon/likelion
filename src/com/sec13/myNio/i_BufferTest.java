package com.sec13.myNio;

import java.nio.ByteBuffer;

public class i_BufferTest {

	public static void main(String[] args) {
		System.out.println("===ByteBuffer 확인===");
		ByteBuffer byteBuffer = ByteBuffer.allocate(10);
		
		byteBuffer.put((byte)'A');
		byteBuffer.put((byte)'B');
		
		byteBuffer.mark();
		
		byteBuffer.put((byte)'C');
		byteBuffer.put((byte)'D');
		
		System.out.println("데이터 저장 후 before reset : " + byteBuffer.position() + " " + byteBuffer.limit());
		
		byteBuffer.reset();
		byteBuffer.put((byte)'E');
		
		
		System.out.println("읽기");
		byteBuffer.flip();
		
		System.out.println("flip 이후 after reset : " + byteBuffer.position() + " " + byteBuffer.limit());
		
		while(byteBuffer.hasRemaining()) {
			System.out.println((char)byteBuffer.get());
		}
	}

}
