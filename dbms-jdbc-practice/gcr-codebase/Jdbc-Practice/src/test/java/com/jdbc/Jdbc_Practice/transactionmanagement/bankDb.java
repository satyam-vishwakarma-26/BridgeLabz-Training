package com.jdbc.Jdbc_Practice.transactionmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class bankDb {
		
		public static void createTable() {
			String createDB= "CREATE DATABASE IF NOT EXISTS bank_db";
			String useDB= "Use bank_db";
			 String createTable = """
		                CREATE TABLE IF NOT EXISTS accounts (
		                 account_id INT PRIMARY KEY, 
		                 balance DOUBLE
		                )
		                """;
			 
			 try (Connection conn = MySQLConnection.getConnection();
				     Statement st = conn.createStatement()) {

				    st.executeUpdate(createDB);
				    System.out.println("Database is created successfully");

				    st.executeUpdate(useDB);
				    System.out.println("Now using bank_db");

				    st.executeUpdate(createTable);
				    System.out.println("Table is created successfully");

				} catch (Exception e) {
				    e.printStackTrace();
				}

		}
		public static void main(String[] args) {
			createTable();
		}
}
