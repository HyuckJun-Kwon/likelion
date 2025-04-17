package com.sec17.tcpexam2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        // 1.ServerSocket(9999)을 생성하여 특정 포트에서 클라이언트의 접속을 대기한다.
        System.out.println(" 나 서버야  ");

        try (ServerSocket serverSocket = new ServerSocket(9999)) {
        	
        	while (true) {
        		Socket client_socket = serverSocket.accept();
        		System.out.println("클라이언트 접속했어");
        		Thread.startVirtualThread(()-> handleClient(client_socket));
        	}
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void handleClient(Socket client_socket) {
    	
    	try(client_socket;
    			OutputStream os = client_socket.getOutputStream();
    			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));){
    		writer.write("가상 스레드 서버에서 응답");
    		writer.flush();
    		
    	} catch (Exception e) {
    		e.printStackTrace();
		}
    }
}
