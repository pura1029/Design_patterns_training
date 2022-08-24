package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionManager {

	private Connection conn;

	private static DataBaseConnectionManager manager = new DataBaseConnectionManager();

	private DataBaseConnectionManager() {

	}

	public static DataBaseConnectionManager getInstance() {
		return manager;
	}

	public void connect() throws SQLException {
		conn = DriverManager.getConnection("ANYURL");
		System.out.println("GOT DB connection");
	}

	public Connection getConn() {
		return conn;
	}

	public void disconnect() throws SQLException {
		conn.close();
		System.out.println("Disconnected");
	}

}
