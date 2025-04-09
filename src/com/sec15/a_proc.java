package com.sec15;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import static common.JDBCTemplate.*;

public class a_proc {
	public static void main(String[] args) {
		Connection conn = getConnection();
		CallableStatement cstmt = null;
		
		try {
			String sql = "{ call PRO01_INSERT() }";
			cstmt = conn.prepareCall(sql);
			
			cstmt.execute();//프로시저 실행
			commit(conn);
		
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		}finally {
			Close(cstmt);
			Close(conn);
		}
	}
}
