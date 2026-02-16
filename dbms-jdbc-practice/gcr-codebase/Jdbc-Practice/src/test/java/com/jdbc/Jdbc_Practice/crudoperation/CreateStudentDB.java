package com.jdbc.Jdbc_Practice.crudoperation;

import java.sql.*;

public class CreateStudentDB {

    public static void CreateDatabaseAndTable() {

        String createDB = "CREATE DATABASE IF NOT EXISTS student_db";
        String useDB = "USE student_db";

        String createTable = """
                CREATE TABLE IF NOT EXISTS students (
                id INT AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(100) NOT NULL,
                email VARCHAR(100) UNIQUE NOT NULL,
                age INT,
                grade VARCHAR(10),
                enrollment_date DATE
                )
                """;

        try (Connection conn = MySQLConnection.getConnection();
             Statement st = conn.createStatement()) {

            st.executeUpdate(createDB);
            System.out.println("Database is created successfully");

            st.execute(useDB);
            System.out.println("Now using student_db");

            st.executeUpdate(createTable);
            System.out.println("Table is created successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

       // CreateDatabaseAndTable();
       
    }
}
