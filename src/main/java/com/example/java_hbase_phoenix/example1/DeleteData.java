package com.example.java_hbase_phoenix.example1;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class DeleteData {

	public static void main (String[] args) {
		
		Connection conn;
		Statement st;
		String sql;
		@SuppressWarnings("unused")
		int rs;
		
		try {
			conn = Config.getConn();
			st = conn.createStatement();
			sql = "DELETE FROM STOCK_SYMBOL WHERE SYMBOL='AAPL'";
			rs = st.executeUpdate(sql);
			conn.commit();
			
			System.out.println("Data Deleted Successfully");
			
			st.close();
			conn.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}