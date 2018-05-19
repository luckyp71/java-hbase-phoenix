package com.example.java_hbase_phoenix.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {

	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("org.apache.phoenix.queryserver.client.Driver");
			conn = DriverManager.getConnection("jdbc:phoenix:thin:url=http://localhost:8765/PHOENIX;serialization=PROTOBUF", "lucky", "pratama");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}