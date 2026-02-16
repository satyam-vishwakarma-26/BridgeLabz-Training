package com.jdbc.Jdbc_Practice.crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

       static String url = "jdbc:mysql://localhost:3306/student_db"; 
       static  String username = "student_user";
       static String password = "1234";

       public static Connection getConnection() throws SQLException {
    	   return DriverManager.getConnection(url, username, password);
       }
}
