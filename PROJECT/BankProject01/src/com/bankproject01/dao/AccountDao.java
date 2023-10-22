package com.bankproject01.dao;

import com.bankproject01.model.Account;
import com.bankproject01.service.DatabaseConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AccountDao {

    //Create userAccount
    public static int createUserAcc(Account c) {
        Connection con = null;
        int checkCreateAcc = -1;

        try {
            con = DatabaseConnect.getConnection();
            //                                                         1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
            String sql = "insert into account( firstName, LastName,fatherName,  contactNumber,  emailId,dateOfBirth,  aadharNo, panNo, accountType,  branch,  gender,  nominee,  address,  amount, toactive)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, c.getFirstName());

            ps.setString(2, c.getLastName());

            ps.setString(3, c.getFatherName());
            ps.setString(4, c.getContactNo());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getDateOfBirth());
            ps.setString(7, c.getAccountType());
            ps.setString(8, c.getBranch());
            ps.setString(9, c.getGender());
            ps.setString(10, c.getNominee());
            ps.setString(11, c.getAddress());
            ps.setDouble(12, c.getAmount());
            ps.setBoolean(13, c.getToActive());

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
}
