package com.bankproject01.dao;

import com.bankproject01.model.Account;
import com.bankproject01.service.DatabaseConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AccountDao {

    private static String email;

    //Create userAccount
    public static int createUserAcc(Account c) {
        Connection con = null;
        int checkCreateAcc = -1;

        try {
            con = DatabaseConnect.getConnection();
            //                                                         1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
            String sql = "insert into account( firstName, lastName,fatherName,  contactNo,  emailId,dateOfBirth,  aadharNumber, panNumber, accountType,  branch,  gender,  nominee,  address,  amount, toactive)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, c.getFirstName());

            ps.setString(2, c.getLastName());

            ps.setString(3, c.getFatherName());
            ps.setString(4, c.getContactNo());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getDateOfBirth());
            ps.setString(7, c.getAadharNumber());
            ps.setString(8, c.getPanNumber());
            ps.setString(9, c.getAccountType());
            ps.setString(10, c.getBranch());
            ps.setString(11, c.getGender());
            ps.setString(12, c.getNominee());
            ps.setString(13, c.getAddress());
            ps.setDouble(14, c.getAmount());
            ps.setBoolean(15, c.getToActive());

            checkCreateAcc = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return checkCreateAcc;
    }

    // set email 
    public static void setEmailMsg(Account account) {
        email = account.getEmail();
    }

    // get email
    public static String getEmailMsg() {
        return email;
    }

}
