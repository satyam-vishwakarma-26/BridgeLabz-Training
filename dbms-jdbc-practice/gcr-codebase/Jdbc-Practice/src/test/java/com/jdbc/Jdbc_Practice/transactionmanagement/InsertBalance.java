package com.jdbc.Jdbc_Practice.transactionmanagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBalance {
	
	 public static void insertAccounts(int account_id, double balance) {

	        String sql = "INSERT INTO accounts(account_id, balance) VALUES(?,?)";

	        try (Connection conn = MySQLConnection.getConnection();
	             PreparedStatement pt = conn.prepareStatement(sql)) {

	            pt.setInt(1, account_id);
	            pt.setDouble(2, balance);
	            
	            int rowsAffected = pt.executeUpdate();
	            System.out.println(rowsAffected + " row(s) inserted successfully");

	        } catch (SQLException e) {
	            System.out.println("Insert Failed " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	 public static void main(String[] args) {
		insertAccounts(101, 10000);
		insertAccounts(102,12000);
		 }

}