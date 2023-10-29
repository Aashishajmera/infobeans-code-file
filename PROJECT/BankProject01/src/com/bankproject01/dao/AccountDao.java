package com.bankproject01.dao;

import com.bankproject01.model.Account;
import com.bankproject01.service.DatabaseConnect;
import com.bankproject01.service.UpdateMail;
import com.bankproject01.service.Validation;
import com.bankproject01.testmain.TestMain;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class AccountDao {

    private static String email;

    //=============================================CREATE USER ACCOUNT========================================
    //Create userAccount
    public static int createUserAcc(Account c) {
        Connection con = null;
        int checkCreateAcc = -1;

        try {
            con = DatabaseConnect.getConnection();

            // create account date:
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String date = dateFormat.format(currentDate);
            java.util.Date date1 = dateFormat.parse(date);
            java.sql.Date sqlStartDate = new java.sql.Date(date1.getTime());

            //                                                         1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17
            String sql = "insert into account( firstName, lastName,fatherName, maritalStatus, contactNo,  emailId,dateOfBirth,  aadharNumber, panNumber, accountType,  branch,  gender,  nominee,  address,  amount, toactive, createdate, pin,ifsc)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, c.getFirstName());

            ps.setString(2, c.getLastName());

            ps.setString(3, c.getFatherName());
            ps.setString(4, c.getStatus());
            ps.setString(5, c.getContactNo());
            ps.setString(6, c.getEmail());
            ps.setString(7, c.getDateOfBirth());
            ps.setString(8, c.getAadharNumber());
            ps.setString(9, c.getPanNumber());
            ps.setString(10, c.getAccountType());
            ps.setString(11, c.getBranch());
            ps.setString(12, c.getGender());
            ps.setString(13, c.getNominee());
            ps.setString(14, c.getAddress());
            ps.setDouble(15, c.getAmount());
            ps.setBoolean(16, c.getToActive());
            ps.setDate(17, sqlStartDate);
            ps.setString(18, c.getPin());
            ps.setString(19, c.getIfsc());

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
    //==================================================PIN============================================

    public static String pinCreate(int length) {
        String numbers = "012345";
        Random rndm_method = new Random();
        char[] otp = new char[length];
        for (int i = 0; i < length; i++) {
            otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return new String(otp);
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
                if (rs.getString(7).equals(email)) {
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

    // get pin 
    public static String getPin() {
        Connection con = null;
        String pin = null;

        try {
            con = DatabaseConnect.getConnection();

            String getAccNum = "select * from account";
            PreparedStatement ps = con.prepareStatement(getAccNum);

//            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString(7).equals(email)) {
                    pin = rs.getString(20);
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
        return pin;

    }

    // get IFSC code
    public static String getIFSC(String branch) {
        if (branch.equals("indore")) {
            return "RSB18100041";
        } else if (branch.equals("dewas")) {
            return "RSB18001000";
        } else {
            return "RSB18104100";
        }
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
                    if (rs.getBoolean(18) != true) {
                        System.out.println("\t\t\t\t\t\t\t\t\t   " + TestMain.setRed + " Account is blocked \t" + TestMain.resetColor);
                    }
                    System.out.println("\t\t\t\t\t\t\t\t Account number:  \t" + rs.getInt(1));
                    System.out.println("\t\t\t\t\t\t\t\t Holder's name:  \t" + rs.getString(2) + " " + rs.getString(3));
                    System.out.println("\t\t\t\t\t\t\t\t Father name:  \t\t" + rs.getString(4));
                    System.out.println("\t\t\t\t\t\t\t\t Marital status:  \t" + rs.getString(5));
                    System.out.println("\t\t\t\t\t\t\t\t Contact number:  \t" + rs.getString(6));
                    System.out.println("\t\t\t\t\t\t\t\t Email :  \t\t" + rs.getString(7));
                    System.out.println("\t\t\t\t\t\t\t\t Date of birth:  \t" + rs.getDate(8));
                    System.out.println("\t\t\t\t\t\t\t\t Aadhar number:  \t" + rs.getString(9));
                    System.out.println("\t\t\t\t\t\t\t\t Pancard number:  \t" + rs.getString(10));
                    System.out.println("\t\t\t\t\t\t\t\t Account type:  \t" + rs.getString(11));
                    System.out.println("\t\t\t\t\t\t\t\t Branch:   \t\t" + rs.getString(12));
                    System.out.println("\t\t\t\t\t\t\t\t IFSC:   \t\t" + rs.getString(13));
                    System.out.println("\t\t\t\t\t\t\t\t Gender:  \t\t" + rs.getString(14));
                    System.out.println("\t\t\t\t\t\t\t\t Nominee:  \t\t" + rs.getString(15));
                    System.out.println("\t\t\t\t\t\t\t\t Address:  \t\t" + rs.getString(16));
                    System.out.println("\t\t\t\t\t\t\t\t Amount:  \t\t" + rs.getDouble(17));
                    System.out.println("\t\t\t\t\t\t\t\t Account create date:  " + rs.getDate(19));
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
                if (rs.getBoolean(18) != true) {
                    System.out.println("\t\t\t\t\t\t\t\t\t  " + TestMain.setRed + " Account is blocked \t" + TestMain.resetColor);
                }
                System.out.println("\t\t\t\t\t\t\t\t Account number:  \t" + rs.getInt(1));
                System.out.println("\t\t\t\t\t\t\t\t Holder's name:  \t" + rs.getString(2) + " " + rs.getString(3));
                System.out.println("\t\t\t\t\t\t\t\t Father name:  \t\t" + rs.getString(4));
                System.out.println("\t\t\t\t\t\t\t\t Marital status:  \t" + rs.getString(5));
                System.out.println("\t\t\t\t\t\t\t\t Contact number:  \t" + rs.getString(6));
                System.out.println("\t\t\t\t\t\t\t\t Email :  \t\t" + rs.getString(7));
                System.out.println("\t\t\t\t\t\t\t\t Date of birth:  \t" + rs.getDate(8));
                System.out.println("\t\t\t\t\t\t\t\t Aadhar number:  \t" + rs.getString(9));
                System.out.println("\t\t\t\t\t\t\t\t Pancard number:  \t" + rs.getString(10));
                System.out.println("\t\t\t\t\t\t\t\t Account type:  \t" + rs.getString(11));
                System.out.println("\t\t\t\t\t\t\t\t Branch:   \t\t" + rs.getString(12));
                System.out.println("\t\t\t\t\t\t\t\t IFSC:   \t\t" + rs.getString(13));
                System.out.println("\t\t\t\t\t\t\t\t Gender:  \t\t" + rs.getString(14));
                System.out.println("\t\t\t\t\t\t\t\t Nominee:  \t\t" + rs.getString(15));
                System.out.println("\t\t\t\t\t\t\t\t Address:  \t\t" + rs.getString(16));
                System.out.println("\t\t\t\t\t\t\t\t Amount:  \t\t" + rs.getDouble(17));
                System.out.println("\t\t\t\t\t\t\t\t Account create date:  " + rs.getDate(19));
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

    //=======================================VIEW ONLY UNBLOCK===========================================
    public static int getBlockList() {
        Connection con = null;
        int checkaccNum = 1;

        try {
            con = DatabaseConnect.getConnection();

            String getAccNum = "select * from account";
            PreparedStatement ps = con.prepareStatement(getAccNum);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                if (rs.getBoolean(18) != true) {
                    System.out.println(TestMain.setYellow + "\t\t\t\t\t\t\t\t\t " + checkaccNum + " ACCOUNT-INFORMATION" + TestMain.resetColor);
                    System.out.println("\t\t\t\t\t\t\t ==================================================");
                    System.out.println("\t\t\t\t\t\t\t\t Account number:  \t" + rs.getInt(1));
                    System.out.println("\t\t\t\t\t\t\t\t Holder's name:  \t" + rs.getString(2) + " " + rs.getString(3));
                    System.out.println("\t\t\t\t\t\t\t\t Father name:  \t\t" + rs.getString(4));
                    System.out.println("\t\t\t\t\t\t\t\t Marital status:  \t" + rs.getString(5));
                    System.out.println("\t\t\t\t\t\t\t\t Contact number:  \t" + rs.getString(6));
                    System.out.println("\t\t\t\t\t\t\t\t Email :  \t\t" + rs.getString(7));
                    System.out.println("\t\t\t\t\t\t\t\t Date of birth:  \t" + rs.getDate(8));
                    System.out.println("\t\t\t\t\t\t\t\t Aadhar number:  \t" + rs.getString(9));
                    System.out.println("\t\t\t\t\t\t\t\t Pancard number:  \t" + rs.getString(10));
                    System.out.println("\t\t\t\t\t\t\t\t Account type:  \t" + rs.getString(11));
                    System.out.println("\t\t\t\t\t\t\t\t Branch:   \t\t" + rs.getString(12));
                    System.out.println("\t\t\t\t\t\t\t\t IFSC:   \t\t" + rs.getString(13));
                    System.out.println("\t\t\t\t\t\t\t\t Gender:  \t\t" + rs.getString(14));
                    System.out.println("\t\t\t\t\t\t\t\t Nominee:  \t\t" + rs.getString(15));
                    System.out.println("\t\t\t\t\t\t\t\t Address:  \t\t" + rs.getString(16));
                    System.out.println("\t\t\t\t\t\t\t\t Amount:  \t\t" + rs.getDouble(17));
                    System.out.println("\t\t\t\t\t\t\t\t Account create date:  " + rs.getDate(19));
                    System.out.println("\t\t\t\t\t\t\t ==================================================");
                    checkaccNum++;
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
//=============================================BLOCK ACCOUNT========================================

    public static int accountBlock(String accountNum) {
//        Connection con = null;
//        int updateActive = -1;
//        try {
//            con = DatabaseConnect.getConnection();
//            String blockQuery = "update account set toactive = false where accountNumber = ?";
//
//            PreparedStatement ps = con.prepareStatement(blockQuery);
//
//            ps.setInt(1, Integer.parseInt(accountNum));
//
//            updateActive = ps.executeUpdate();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                con.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return updateActive;

        // alredy block
        Connection con = null;
        int updateActive = -1;
        try {

            con = DatabaseConnect.getConnection();
            String sqlQuery = "select * from account where accountNumber = ?";
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setString(1, accountNum);
            ResultSet rs = ps.executeQuery();
            boolean flag = true;
            while (rs.next() && flag == false) {

                if (!rs.getBoolean(18) && (rs.getInt(1) == Integer.parseInt(accountNum))) {
                    System.out.println(TestMain.setGreen + "Account is alredy blocked..." + TestMain.resetColor);
                    flag = false;
                    updateActive = 100;
//                    break;
                }
//                if (flag == false) {
//                    break;
//                }
            }

            if (flag) {
                String blockQuery = "update account set toactive = false where accountNumber = ?";
//
                ps = con.prepareStatement(blockQuery);

                ps.setInt(1, Integer.parseInt(accountNum));

                updateActive = ps.executeUpdate();
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
        return updateActive;
    }
////=============================================BLOCK ACCOUNT========================================
//    public static int accountBlock(String accountNum) {
//        Connection con = null;
//        int updateActive = 0;
//        try {
//            con = DatabaseConnect.getConnection();
//
//            String getAccNum = "select * from account";
//            PreparedStatement ps = con.prepareStatement(getAccNum);
//
//            ResultSet rs = ps.executeQuery();
//            boolean flag = false;
//            while (rs.next()) {
//                if (rs.getBoolean(16) == false && rs.getInt(1) == Integer.parseInt(accountNum)) {
//                    System.out.println("Account is alread blocked...");
//                    flag = true;
//                    break;
//                }
//            }
//
//            if (flag == false) {
//
//                String blockQuery = "update account set toactive = false where accountNumber = ?";
//
//                ps.setInt(1, Integer.parseInt(accountNum));
//
//                updateActive = ps.executeUpdate();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                con.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return updateActive;
//    }
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

//====================================================USER-ACCOUNT=========================================
    public static boolean customerLogin(int accountNumber, String firstName, String pin) {

        Connection con = null;

        boolean checkCustomerLog = false;
        try {
            // add connection 
            con = DatabaseConnect.getConnection();
            // System.out.println("Database connected.....");

            // write to customer login query
            String adminloginQuery = "select * from account where accountNumber = ? and firstName = ? and pin = ?";
            PreparedStatement ps = con.prepareStatement(adminloginQuery);

            ps.setInt(1, accountNumber);
            ps.setString(2, firstName);
            ps.setString(3, pin);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getInt(1) == accountNumber && rs.getString(2).equalsIgnoreCase(firstName) && rs.getBoolean(17) && rs.getString(20).equals(pin)) {
                    checkCustomerLog = true;
                } else {
                    System.out.println("Account is blocked");
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
        return checkCustomerLog;
    }

    //======================================UPDATE-FIELD=============================================
    // update name: 
    public static int updateName(String AccountNum, Scanner sc) {
        Connection con = null;
        int checkName = -1;
        try {
            con = DatabaseConnect.getConnection();
            System.out.print("Enter your name:");
            String firstName = sc.nextLine();
            firstName = Validation.noEmpty(firstName, sc);
            boolean checkfName = firstName.matches("[a-zA-Z , ]+");
            int count = 1;
            while (count <= 2 && checkfName == false) {
                if (!checkfName) {
                    System.out.println(TestMain.setRed + "Invalid Name please re-enter" + TestMain.resetColor);
                    firstName = sc.nextLine();
                }
                firstName = Validation.noEmpty(firstName, sc);
                checkfName = firstName.matches("[a-zA-Z , ]+");
                count++;
            }
            if (checkfName) {
                String nameQuery = "update account set firstName = ? where Accountnumber= ?";
                PreparedStatement ps = con.prepareStatement(nameQuery);

                ps.setString(1, firstName);
                ps.setInt(2, Integer.parseInt(AccountNum));

                checkName = ps.executeUpdate();
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
        return checkName;
    }

    // update father name
    public static int updateFaherName(String AccountNum, Scanner sc) {
        Connection con = null;
        int checkName = -1;
        try {
            con = DatabaseConnect.getConnection();
            System.out.print("Enter father name:");
            String fatherName = sc.nextLine();
            fatherName = Validation.noEmpty(fatherName, sc);
            boolean checkfName = fatherName.matches("[a-zA-Z , ]+");
            int count = 1;
            while (count <= 2 && checkfName == false) {
                if (!checkfName) {
                    System.out.println(TestMain.setRed + "Invalid Name please re-enter" + TestMain.resetColor);
                    fatherName = sc.nextLine();
                }
                fatherName = Validation.noEmpty(fatherName, sc);
                checkfName = fatherName.matches("[a-zA-Z , ]+");
                count++;
            }
            if (checkfName) {
                String nameQuery = "update account set fatherName = ? where Accountnumber= ?";
                PreparedStatement ps = con.prepareStatement(nameQuery);

                ps.setString(1, fatherName);
                ps.setInt(2, Integer.parseInt(AccountNum));

                checkName = ps.executeUpdate();
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
        return checkName;
    }

    //UPDATE MOBILE NUMBER: 
    public static int updateMobileNum(String AccountNum, Scanner sc) {
        Connection con = null;
        int checkMobile = -1;
        try {
            con = DatabaseConnect.getConnection();
            System.out.print("Enter mobile number:");
            String mobileNum = sc.next();
            mobileNum = Validation.noEmpty(mobileNum, sc);
            boolean checkfName = mobileNum.matches("\\d{10}");
            int count = 1;
            while (count <= 2 && checkfName == false) {
                if (!checkfName) {
                    System.out.println(TestMain.setRed + "Invalid number please re-enter" + TestMain.resetColor);
                    mobileNum = sc.next();
                }
                mobileNum = Validation.noEmpty(mobileNum, sc);
                checkfName = mobileNum.matches("\\d{10}");
                count++;
            }
            if (checkfName) {
                String nameQuery = "update account set contactNo = ? where Accountnumber= ?";
                PreparedStatement ps = con.prepareStatement(nameQuery);

                ps.setString(1, mobileNum);
                ps.setInt(2, Integer.parseInt(AccountNum));

                checkMobile = ps.executeUpdate();
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
        return checkMobile;
    }

    // UPDATE ADDRESS
    public static int updateAddress(String AccountNum, Scanner sc) {
        Connection con = null;
        int checkAddress = -1;
        try {
            con = DatabaseConnect.getConnection();
            System.out.print("Enter Address:");
            String address = sc.nextLine();
            address = Validation.noEmpty(address, sc);
            boolean checkAddr = address.matches("[a-zA-z0-9 \\-\\. , ]+");
            int count = 1;
            while (count <= 2 && checkAddr == false) {
                if (!checkAddr) {
                    System.out.println(TestMain.setRed + "Invalid address please re-enter" + TestMain.resetColor);
                    address = sc.nextLine();
                }
                address = Validation.noEmpty(address, sc);
                checkAddr = address.matches("[a-zA-z0-9 \\-\\. , ]+");
                count++;
            }
            if (checkAddr) {
                String nameQuery = "update account set address = ? where Accountnumber= ?";
                PreparedStatement ps = con.prepareStatement(nameQuery);

                ps.setString(1, address);
                ps.setInt(2, Integer.parseInt(AccountNum));

                checkAddress = ps.executeUpdate();
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
        return checkAddress;
    }

    // UPDATE NOMINEE NAME
    public static int updateNomineeName(String AccountNum, Scanner sc) {
        Connection con = null;
        int checkNominee = -1;
        try {
            con = DatabaseConnect.getConnection();
            System.out.print("Enter Nominee name:");
            String nomineeName = sc.nextLine();
            nomineeName = Validation.noEmpty(nomineeName, sc);
            boolean checkNomi = nomineeName.matches("[a-zA-Z , ]+");
            int count = 1;
            while (count <= 2 && checkNomi == false) {
                if (!checkNomi) {
                    System.out.println(TestMain.setRed + "Invalid nominee name please re-enter" + TestMain.resetColor);
                    nomineeName = sc.nextLine();
                }
                nomineeName = Validation.noEmpty(nomineeName, sc);
                checkNomi = nomineeName.matches("[a-zA-Z , ]+");
                count++;
            }
            if (checkNomi) {
                String nameQuery = "update account set nominee = ? where Accountnumber= ?";
                PreparedStatement ps = con.prepareStatement(nameQuery);

                ps.setString(1, nomineeName);
                ps.setInt(2, Integer.parseInt(AccountNum));

                checkNominee = ps.executeUpdate();
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
        return checkNominee;
    }

    // UPDATE EMAIL
    public static int updateEmail(String AccountNum, Scanner sc) {
        Connection con = null;
        int checkEmail = -1;
        try {
            con = DatabaseConnect.getConnection();
            System.out.print("Enter Email:");
            String email = sc.nextLine();
            email = Validation.noEmpty(email, sc);
            boolean checkEmailadd = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
            int count = 1;
            while (count <= 2 && checkEmailadd == false) {
                if (!checkEmailadd) {
                    System.out.println(TestMain.setRed + "Invalid email please re-enter" + TestMain.resetColor);
                    email = sc.nextLine();
                }
                email = Validation.noEmpty(email, sc);
                checkEmailadd = email.matches("^[A-Za-z][0-9+_.-]+@[A-Za-z0-9.-]+$");
                count++;
            }
            if (checkEmailadd) {
                String nameQuery = "update account set emailId = ? where Accountnumber= ?";
                PreparedStatement ps = con.prepareStatement(nameQuery);

                ps.setString(1, email);
                ps.setInt(2, Integer.parseInt(AccountNum));

                checkEmail = ps.executeUpdate();
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
        return checkEmail;
    }

    // UPDATE DATE: 
    public static int updateDate(String AccountNum, Scanner sc) {
        Connection con = null;
        int checkDate = -1;
        try {
            con = DatabaseConnect.getConnection();
            System.out.print("Enter Date (yyyy-mm-dd):");
            String date = sc.nextLine();
            date = Validation.noEmpty(date, sc);
            boolean checkDateadd = date.matches("\\d{4}-\\d{2}-\\d{2}");
            int count = 1;
            while (count <= 2 && checkDateadd == false) {
                if (!checkDateadd) {
                    System.out.println(TestMain.setRed + "Invalid date please re-enter" + TestMain.resetColor);
                    date = sc.nextLine();
                }
                date = Validation.noEmpty(date, sc);
                checkDateadd = date.matches("\\d{4}-\\d{2}-\\d{2}");
                count++;
            }
            if (checkDateadd) {
                String nameQuery = "update account set dateOfBirth = ? where Accountnumber= ?";
                PreparedStatement ps = con.prepareStatement(nameQuery);

                ps.setString(1, date);
                ps.setInt(2, Integer.parseInt(AccountNum));

                checkDate = ps.executeUpdate();
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
        return checkDate;
    }

    // UPDATE PIN NUMBER
    public static int updatePin(String AccountNum, Scanner sc) {
        Connection con = null;
        int checkDate = -1;
        try {
            con = DatabaseConnect.getConnection();
            System.out.print("Enter pin:");
            String pin = sc.nextLine();
            pin = Validation.noEmpty(pin, sc);
            boolean checkPin = pin.matches("\\d{6}");
            int count = 1;
            while (count <= 2 && checkPin == false) {
                if (!checkPin) {
                    System.out.println(TestMain.setRed + "Invalid pin please re-enter" + TestMain.resetColor);
                    pin = sc.nextLine();
                }
                pin = Validation.noEmpty(pin, sc);
                checkPin = (pin.length() <= 6);
                count++;
            }
            if (checkPin) {
                String nameQuery = "update account set pin = ? where Accountnumber= ?";
                PreparedStatement ps = con.prepareStatement(nameQuery);

                ps.setString(1, pin);
                ps.setInt(2, Integer.parseInt(AccountNum));

                checkDate = ps.executeUpdate();
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
        return checkDate;
    }

    // send update mail
    public static void updateMailMsg(String AccountNum) {
        Connection con = null;
        try {
            con = DatabaseConnect.getConnection();
            String getDataQuery = "select * from account";
            PreparedStatement ps = con.prepareStatement(getDataQuery);

            ResultSet rs = ps.executeQuery();
            String email = "null";
            String pin = "null";
            while (rs.next()) {
                if (rs.getInt(1) == Integer.parseInt(AccountNum)) {
                    email = rs.getString(7);
                    pin = rs.getString(20);
                }
            }

            // set email and updte pin 
            new UpdateMail().setValue(pin, email);
            String[] args = null;
            UpdateMail.main(args);

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

    //==============================================CUSTOMER-VIEW-ACCOUNT==============================
    public static int viewDetails(String accountNumber) {
        int checkViewDetails = -1;
        Connection con = null;
        try {
            con = DatabaseConnect.getConnection();
            String viewDetailQuery = "select * from account where accountNumber=?";
            PreparedStatement ps = con.prepareStatement(viewDetailQuery);
            ps.setInt(1, Integer.parseInt(accountNumber));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getInt(1) == Integer.parseInt(accountNumber)) {
                    checkViewDetails = 1;
                    System.out.println(TestMain.setYellow + "\t\t\t\t\t\t\t\t\tACCOUNT-INFORMATION" + TestMain.resetColor
                    );
                    System.out.println("\t\t\t\t\t\t\t ==================================================");
                    System.out.println("\t\t\t\t\t\t\t\t Account number:  \t" + rs.getInt(1));
                    System.out.println("\t\t\t\t\t\t\t\t Holder's name:  \t" + rs.getString(2) + " " + rs.getString(3));
                    System.out.println("\t\t\t\t\t\t\t\t Father name:  \t\t" + rs.getString(4));
                    System.out.println("\t\t\t\t\t\t\t\t Marital status:  \t" + rs.getString(5));
                    System.out.println("\t\t\t\t\t\t\t\t Contact number:  \t" + rs.getString(6));
                    System.out.println("\t\t\t\t\t\t\t\t Email :  \t\t" + rs.getString(7));
                    System.out.println("\t\t\t\t\t\t\t\t Date of birth:  \t" + rs.getDate(8));
                    System.out.println("\t\t\t\t\t\t\t\t Aadhar number:  \t" + rs.getString(9));
                    System.out.println("\t\t\t\t\t\t\t\t Pancard number:  \t" + rs.getString(10));
                    System.out.println("\t\t\t\t\t\t\t\t Account type:  \t" + rs.getString(11));
                    System.out.println("\t\t\t\t\t\t\t\t Branch:   \t\t" + rs.getString(12));
                    System.out.println("\t\t\t\t\t\t\t\t IFSC:   \t\t" + rs.getString(13));
                    System.out.println("\t\t\t\t\t\t\t\t Gender:  \t\t" + rs.getString(14));
                    System.out.println("\t\t\t\t\t\t\t\t Nominee:  \t\t" + rs.getString(15));
                    System.out.println("\t\t\t\t\t\t\t\t Address:  \t\t" + rs.getString(16));
                    System.out.println("\t\t\t\t\t\t\t\t Amount:  \t\t" + rs.getDouble(17));
                    System.out.println("\t\t\t\t\t\t\t\t Account create date:  " + rs.getDate(19));
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
            return checkViewDetails;
        }

    }

    public static int viewBalance(String accountNumber) {

        int checkViewBalance = -1;
        Connection con = null;
        try {
            con = DatabaseConnect.getConnection();
            String viewDetailQuery = "select * from account where accountNumber=?";
            PreparedStatement ps = con.prepareStatement(viewDetailQuery);
            ps.setInt(1, Integer.parseInt(accountNumber));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                if (rs.getInt(1) == Integer.parseInt(accountNumber)) {
                    checkViewBalance = 1;
                    System.out.println("If");

                    System.out.println(TestMain.setYellow + "\t\t\t\t\t\t\t\t\tYOUR BALANCE" + TestMain.resetColor
                    );
                    System.out.println("\t\t\t\t\t\t\t =============================================");

                    System.out.println("\t\t\t\t\t\t\t\t Balance:  \t" + rs.getDouble(17) + " Rs.");

                    System.out.println("\t\t\t\t\t\t\t =============================================");

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
            return checkViewBalance;
        }

    }

}
