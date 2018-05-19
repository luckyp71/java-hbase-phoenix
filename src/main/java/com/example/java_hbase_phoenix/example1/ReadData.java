package com.example.java_hbase_phoenix.example1;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadData {

	public static void main(String[] args) {
		
		Connection conn;
		Statement st;
		ResultSet rs;
		
		try {
			conn = Config.getConn();
			st = conn.createStatement();
			String sql;
			sql = "SELECT * FROM STOCK_SYMBOL";
			rs = st.executeQuery(sql);

			while (rs.next()) {
				String symbol = rs.getString(1);
				String company = rs.getString(2);
				System.out.println("Stock Symbol: "+symbol + "\nCompany     : " + company+"\n");
			}
			
			rs.close();
			st.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}