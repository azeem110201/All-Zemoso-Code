package com.azeem.hibernatetuts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String username = "root";
        String password = "Fr57@zu70";

        try{
            System.out.println("Connecting to Database........");

            Connection myConn = DriverManager.getConnection(jdbcURL, username, password);

            System.out.println("Connected Successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
