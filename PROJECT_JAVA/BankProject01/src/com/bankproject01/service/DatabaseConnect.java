package com.bankproject01.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnect {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rsb", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
