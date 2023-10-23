package com.bankproject01.dao;

import com.bankproject01.model.Account;
import com.bankproject01.service.DatabaseConnect;
import com.bankproject01.testmain.TestMain;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountDao {

    private static String email;

    //=============================================CREATE USER ACCOUNT========================================
    //Create userAccount
    public static int createUserAcc(Account c) {
        Connection con = null;
        int checkCreateAcc = -1;

        try {
            con = DatabaseConnect.getConnection();

            // create account date;
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String date = dateFormat.format(currentDate);
            java.util.Date date1 = dateFormat.parse(date);
            java.sql.Date sqlStartDate = new java.sql.Date(date1.getTime());

            //                                                         1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
            String sql = "insert into account( firstName, lastName,fatherName,  contactNo,  emailId,dateOfBirth,  aadharNumber, panNumber, accountType,  branch,  gender,  nominee,  address,  amount, toactive, createdate)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
            ps.setDate(16, sqlStartDate);

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

    // block account 
    public static void blockAccount(String accountNum) {

    }

    //==================================================MAIL============================================
    // set email 
    public static void setEmailMsg(Account account) {
        email = account.getEmail();
    }

    // get email
    public static String getEmailMsg() {
        return email;
    }

    // get account number
    public static int getAccnum() {
        Connection con = null;
        int accountNum = 0;

        try {
            con = DatabaseConnect.getConnection();

            String getAccNum = "select * from account";
            PreparedStatement ps = con.prepareStatement(getAccNum);

//            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString(6).equals(email)) {
                    accountNum = rs.getInt(1);
                }
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
        return accountNum;
    }

    //=============================================VIEW ANY ACCOUNT========================================
    public static int getAnyAccountinfo(String accountNum) {
        Connection con = null;
        int checkaccNum = -1;

        try {
            con = DatabaseConnect.getConnection();

            String getAccNum = "select * from account where accountNumber = ?";
            PreparedStatement ps = con.prepareStatement(getAccNum);

            ps.setInt(1, Integer.parseInt(accountNum));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getInt(1) == Integer.parseInt(accountNum)) {
                    checkaccNum = 1;
                    System.out.println(TestMain.setYellow + "\t\t\t\t\t\t\t\t\tACCOUNT-INFORMATION" + TestMain.resetColor
                    );
                    System.out.println("\t\t\t\t\t\t\t ==================================================");
                    if (rs.getBoolean(16) != true) {
                        System.out.println("\t\t\t\t\t\t\t\t\t   " + TestMain.setRed + " Account is blocked \t" + TestMain.resetColor);
                    }
                    System.out.println("\t\t\t\t\t\t\t\t Account number:  \t" + rs.getInt(1));
                    System.out.println("\t\t\t\t\t\t\t\t Holder's name:  \t" + rs.getString(2) + " " + rs.getString(3));
                    System.out.println("\t\t\t\t\t\t\t\t Father name:  \t\t" + rs.getString(4));
                    System.out.println("\t\t\t\t\t\t\t\t Contact number:  \t" + rs.getString(5));
                    System.out.println("\t\t\t\t\t\t\t\t Email :  \t\t" + rs.getString(6));
                    System.out.println("\t\t\t\t\t\t\t\t Date of birth:  \t" + rs.getDate(7));
                    System.out.println("\t\t\t\t\t\t\t\t Aadhar number:  \t" + rs.getString(8));
                    System.out.println("\t\t\t\t\t\t\t\t Pancard number:  \t" + rs.getString(9));
                    System.out.println("\t\t\t\t\t\t\t\t Account type:  \t\t" + rs.getString(10));
                    System.out.println("\t\t\t\t\t\t\t\t Branch:   \t\t" + rs.getString(11));
                    System.out.println("\t\t\t\t\t\t\t\t Gender:  \t\t" + rs.getString(12));
                    System.out.println("\t\t\t\t\t\t\t\t Nominee:  \t\t" + rs.getString(13));
                    System.out.println("\t\t\t\t\t\t\t\t Address:  \t\t" + rs.getString(14));
                    System.out.println("\t\t\t\t\t\t\t\t Amount:  \t\t" + rs.getDouble(15));
                    System.out.println("\t\t\t\t\t\t\t\t Account create date:  \t" + rs.getDate(17));
                    System.out.println("\t\t\t\t\t\t\t ==================================================");

                }
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
        return checkaccNum;
    }

    //=============================================VIEW ALL ACCOUNT========================================
    public static int getAllAccountinfo() {
        Connection con = null;
        int checkaccNum = 1;

        try {
            con = DatabaseConnect.getConnection();

            String getAccNum = "select * from account";
            PreparedStatement ps = con.prepareStatement(getAccNum);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(TestMain.setYellow + "\t\t\t\t\t\t\t\t\t " + checkaccNum + " ACCOUNT-INFORMATION" + TestMain.resetColor
                );
                System.out.println("\t\t\t\t\t\t\t ==================================================");
                if (rs.getBoolean(16) != true) {
                    System.out.println("\t\t\t\t\t\t\t\t\t  " + TestMain.setRed + " Account is blocked \t" + TestMain.resetColor);
                }
                System.out.println("\t\t\t\t\t\t\t\t Account number:  \t" + rs.getInt(1));
                System.out.println("\t\t\t\t\t\t\t\t Holder's name:  \t" + rs.getString(2) + " " + rs.getString(3));
                System.out.println("\t\t\t\t\t\t\t\t Father name:  \t\t" + rs.getString(4));
                System.out.println("\t\t\t\t\t\t\t\t Contact number:  \t" + rs.getString(5));
                System.out.println("\t\t\t\t\t\t\t\t Email :  \t\t" + rs.getString(6));
                System.out.println("\t\t\t\t\t\t\t\t Date of birth:  \t" + rs.getDate(7));
                System.out.println("\t\t\t\t\t\t\t\t Aadhar number:  \t" + rs.getString(8));
                System.out.println("\t\t\t\t\t\t\t\t Pancard number:  \t" + rs.getString(9));
                System.out.println("\t\t\t\t\t\t\t\t Account type:  \t\t" + rs.getString(10));
                System.out.println("\t\t\t\t\t\t\t\t Branch:   \t\t" + rs.getString(11));
                System.out.println("\t\t\t\t\t\t\t\t Gender:  \t\t" + rs.getString(12));
                System.out.println("\t\t\t\t\t\t\t\t Nominee:  \t\t" + rs.getString(13));
                System.out.println("\t\t\t\t\t\t\t\t Address:  \t\t" + rs.getString(14));
                System.out.println("\t\t\t\t\t\t\t\t Amount:  \t\t" + rs.getDouble(15));
                System.out.println("\t\t\t\t\t\t\t\t Account create date:  \t" + rs.getDate(17));
                System.out.println("\t\t\t\t\t\t\t ==================================================");

                checkaccNum++;
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
        return checkaccNum;
    }

    //=============================================BLOCK ACCOUNT========================================
    public static int accountBlock(String accountNum) {
        Connection con = null;
        int updateActive = -1;
        try {
            con = DatabaseConnect.getConnection();
            String blockQuery = "update account set toactive = false where accountNumber = ?";

            PreparedStatement ps = con.prepareStatement(blockQuery);

            ps.setInt(1, Integer.parseInt(accountNum));

            updateActive = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return updateActive;
    }

    //=============================================UNBLOCK ACCOUNT========================================
    public static int accountUnBlock(String accountNum) {
        Connection con = null;
        int updateActive = -1;
        try {
            con = DatabaseConnect.getConnection();
            String blockQuery = "update account set toactive = true where accountNumber = ?";

            PreparedStatement ps = con.prepareStatement(blockQuery);

            ps.setInt(1, Integer.parseInt(accountNum));

            updateActive = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return updateActive;
    }
}
