package com.database2prprtmnt.dao;

import com.database2prprstmnt.model.CreateAccount;
import com.database2prprstmnt.service.DatabaseConnect;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudOperationMethd {

//    public static int updateData(int id) {
//        Connection con = null;
//        int checkUpdate = 0;
//
//        try {
//            con = DatabaseConnect.getConnection();
//            String updateQuery = 
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                con.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        return id;
//    }
    public static int inserData(CreateAccount ca) {
        Connection con = null;
        int checkInsertData = -1;
        try {
            con = DatabaseConnect.getConnection();
            System.out.println("Database successfull added......");
            String insertQry = "insert into create_account(name,father,toactive) values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(insertQry);

            ps.setString(1, ca.getName());
            ps.setString(2, ca.getFather());
            ps.setBoolean(3, ca.getToActive());

            checkInsertData = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return checkInsertData;
    }

    public static int deleteData(int id) {
        Connection con = null;
        int checkAccDelete = 0;
        try {
            con = DatabaseConnect.getConnection();
            System.out.println("Database successfully added: ");

            String deleteQuer = "delete from create_account where id =?";
            PreparedStatement ps = con.prepareStatement(deleteQuer);

            ps.setInt(1, id);
            checkAccDelete = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return checkAccDelete;
    }

    public static void viewAllaccount() {
        Connection con = null;
        try {
            con = DatabaseConnect.getConnection();
            System.out.println("Database connect successfully ....");

            String viewAllaccQuery = "select * from create_account";

            PreparedStatement ps = con.prepareStatement(viewAllaccQuery);

            ResultSet rs = ps.executeQuery();
            rs.absolute(-1);
            System.out.println(rs.getRow() + "askldfjaskl");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4));
//            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
