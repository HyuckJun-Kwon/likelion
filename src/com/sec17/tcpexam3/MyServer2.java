package com.sec17.tcpexam3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.*;

public class MyServer2 {
	
	private static final AtomicInteger clientCounter = new AtomicInteger(0);
    
	public static void main(String[] args) {
        // 1.ServerSocket(9999)을 생성하여 특정 포트에서 클라이언트의 접속을 대기한다.
        System.out.println("서버 실행 완료");

        try (ServerSocket serverSocket = new ServerSocket(9999)) {
        	
        	while (true) {
        		Socket client_socket = serverSocket.accept();
        		
        		int clientId = clientCounter.incrementAndGet();
        		String c_IP = client_socket.getInetAddress().getHostAddress();
        		int c_PORT = client_socket.getPort();
        		LocalDateTime c_Time = LocalDateTime.now();
        		
        		System.out.printf("[클라이언트 %d]님이 접속했습니다. | IP : %s| PORT : %d| TIME : %s|\n" ,clientId, c_IP, c_PORT, c_Time);
        		
        		logFileClient(clientId, c_IP, c_PORT, c_Time);
        		Thread.startVirtualThread(()-> handleClient(client_socket, clientId));
        	}
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void logFileClient(int clientId, String c_IP, int c_PORT, LocalDateTime c_Time) {
    	String dateString = c_Time.toLocalDate().format(DateTimeFormatter.ISO_DATE);
    	File Mylogfile = new File("client_log_"+dateString+".txt");
    	try(BufferedWriter logWriter = 
    			new BufferedWriter(
    					new OutputStreamWriter(
    							new FileOutputStream(Mylogfile, true), StandardCharsets.UTF_8))){
    		
    		String str = String.format("[클라이언트 %d]님이 접속했습니다. | IP : %s| PORT : %d| TIME : %s|\n" ,clientId, c_IP, c_PORT, c_Time);
    		logWriter.write(str);
    		
    	} catch (IOException e) {
    		e.printStackTrace();
		}
		
	}
	private static void handleClient(Socket client_socket, int clientId) {
    	
    	try(client_socket;
    			OutputStream os = client_socket.getOutputStream();
    			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));){
    		writer.write("[서버 응답] 클라이언트 " + clientId + "님, 환영합니다.\n");
    		writer.flush();
    		System.out.printf("[클라이언트 %d] 응답 완료 - 연결 종료 \n", clientId);
    	} catch (Exception e) {
    		e.printStackTrace();
		}
    }
}
