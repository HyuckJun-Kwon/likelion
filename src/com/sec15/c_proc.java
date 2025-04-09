package com.sec15;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Scanner;
import static common.JDBCTemplate.*;

public class c_proc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("변경할 인원의 사원 번호를 입력하세요 : ");
		int empno = scanner.nextInt();
		scanner.nextLine();
		System.out.print("변경할 인원의 이름을 입력하세요 : ");
		String ename = scanner.nextLine();
		
		
		Connection conn = getConnection();
		CallableStatement cstmt = null;
		
		try {
			String sql = "{ call PRO03_UPDATE(?, ?) }";
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, empno);
			cstmt.setString(2, ename);
			
			cstmt.executeUpdate();//프로시저 실행
			System.out.println("변경 완료");
			commit(conn);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Close(cstmt);
			Close(conn);
			scanner.close();
			
		}
	}
}
