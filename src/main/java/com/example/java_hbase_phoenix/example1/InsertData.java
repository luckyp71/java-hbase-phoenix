package com.example.java_hbase_phoenix.example1;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class InsertData {
	
	public static void main (String[] args) {
		
		Connection conn;
		Statement st;
		String sql;
		@SuppressWarnings("unused")
		int rs;
		
		try {
			conn = Config.getConn();
			st = conn.createStatement();
			sql = "UPSERT INTO STOCK_SYMBOL VALUES ('AAPL','Apple Inc')";
			rs = st.executeUpdate(sql);
			conn.commit();
			
			System.out.println("Data Inserted Successfully");
			
			st.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}