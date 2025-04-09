package com.sec15;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Scanner;
import static common.JDBCTemplate.*;

public class b_proc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 사원 번호를 입력하세요 : ");
		int empno = scanner.nextInt();
		
		Connection conn = getConnection();
		CallableStatement cstmt = null;
		
		try {
			String sql = "{ call PRO02_DELETE(?) }";
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, empno);
			
			cstmt.executeUpdate();//프로시저 실행
			System.out.println("삭제 완료");
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
