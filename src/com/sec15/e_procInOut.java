package com.sec15;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.SQLException;
import static common.JDBCTemplate.*;

public class e_procInOut {
	public static void main(String[] args) {
		Connection conn = getConnection();
		CallableStatement cstmt = null;
		
		
		
		try {
			String sql = "{ call PRO09_SALARY_BONUS(?) }";
			cstmt = conn.prepareCall(sql);
			int empno = 3;
			
			cstmt.setInt(1, empno);
			cstmt.registerOutParameter(1,java.sql.Types.INTEGER);
			
			cstmt.execute();
			
			int res = cstmt.getInt(1);
			System.out.println("사원번호 : " + empno + "의 예상 보너스 = " + res);
			
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Close(cstmt);
			Close(conn);
		}
	}
}
