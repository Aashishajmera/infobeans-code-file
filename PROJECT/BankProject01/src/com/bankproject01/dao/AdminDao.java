package com.bankproject01.dao;

import com.bankproject01.model.Admin;
import com.bankproject01.service.DatabaseConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDao {

    public static boolean adminLogin(int id, String password) {

        // create ref of connection class
        Connection con = null;

        boolean checkAdminLog = false;
        try {
            // add connection 
            con = DatabaseConnect.getConnection();
            System.out.println("Database connected.....");

            // write to admin login query
            String adminloginQuery = "select * from admin where id = ? and password = ?";
            PreparedStatement ps = con.prepareStatement(adminloginQuery);

            ps.setInt(1, id);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                checkAdminLog = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return checkAdminLog;
    }
}
