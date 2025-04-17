package com.sec17.obj;

import java.net.*;
import java.io.*;

public class MyServer {
	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(7777)){
			System.out.println("...서버 대기중...");
		
			while(true) {
				Socket client = server.accept();
				System.out.println("클라이언트 접속");
			
				try(ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
						ObjectInputStream ois = new ObjectInputStream(client.getInputStream())){
					
					SendData response = (SendData)ois.readObject();
					double res = MyCalculte(response.getNum1(), response.getNum2(), response.getOp());
					response.setResult(res);
				
					oos.writeObject(response);
					oos.flush();
				}catch(IOException e) {
					e.printStackTrace();
				}
			
				
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		
		}
	}

	private static double MyCalculte(double a, double b, String op) {
		return switch(op) {
		case "+" -> a + b;
		case "-" -> a - b;
		case "*" -> a * b;
		case "/" -> b != 0 ? a / b : Double.NaN;
		default -> 0;
		};
	}

}
