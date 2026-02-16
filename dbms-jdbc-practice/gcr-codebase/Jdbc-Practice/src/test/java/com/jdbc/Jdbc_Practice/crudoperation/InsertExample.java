package com.jdbc.Jdbc_Practice.crudoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample {
	
	 public static void insertStudent(String name, String email, int age, String grade) {

	        String sql = "INSERT INTO students(name,email,age,grade,enrollment_date) VALUES(?,?,?,?,?)";

	        try (Connection conn = MySQLConnection.getConnection();
	             PreparedStatement pt = conn.prepareStatement(sql)) {

	            pt.setString(1, name);
	            pt.setString(2, email);
	            pt.setInt(3, age);
	            pt.setString(4, grade);
	            pt.setDate(5, new java.sql.Date(System.currentTimeMillis()));

	            int rowsAffected = pt.executeUpdate();
	            System.out.println(rowsAffected + " row(s) inserted successfully");

	        } catch (SQLException e) {
	            System.out.println("Insert Failed " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	 public static void main(String[] args) {
		 insertStudent("John Doe", "john.doe@email.com", 20, "A");
		 insertStudent("Jane Smith", "jane.smith@email.com", 22, "B");
		 }

}
