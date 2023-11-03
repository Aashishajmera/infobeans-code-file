package com.bankproject01.dao;

import com.bankproject01.service.DatabaseConnect;
import com.bankproject01.testmain.TestMain;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionDao {

// transaction 
    public static int transactionCode(String sendAcc, String recAcc, Double amount, String pin) {
        Connection con = null;
        int checktransaction = -1;

        try {
            con = DatabaseConnect.getConnection();

            String checkQuery = "select * from account";
            PreparedStatement ps = con.prepareStatement(checkQuery, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = ps.executeQuery();
            boolean checksendAcc = false, checkReceAcc = false, checkAmount = false, checkPin = false, checkLess = false;

            while (rs.next()) {
                if (rs.getInt(1) == Integer.parseInt(sendAcc)) {
                    checksendAcc = true;
                    if (rs.getDouble(17) >= amount) {
                        checkAmount = true;
                        if (rs.getDouble(17) >= amount && amount > 0) {
                            checkLess = true;
                        }
                    }

                    if (rs.getString(20).equals(pin) && rs.getInt(1) == Integer.parseInt(sendAcc)) {
                        checkPin = true;
                    }
                }
            }

            rs.beforeFirst();

            while (rs.next()) {
                if (rs.getInt(1) == Integer.parseInt(recAcc) && rs.getInt(1) != Integer.parseInt(sendAcc)) {
                    checkReceAcc = true;
                }
            }

            // check condition 
            if (!checksendAcc) {
                System.out.println(TestMain.setRed + "Invalid sender account Number: " + TestMain.resetColor);
            }
            if (!checkAmount) {
                System.out.println(TestMain.setRed + "Insufficient amount" + TestMain.resetColor);
            }
            if (!checkReceAcc) {
                System.out.println(TestMain.setRed + "Invalid Receive account Number: " + TestMain.resetColor);
            }
            if (!checkPin) {
                System.out.println(TestMain.setRed + "Invalid pin Number: " + TestMain.resetColor);
            }
            if (!checkLess) {
                System.out.println(TestMain.setRed + "Invalid amount: " + TestMain.resetColor);
            }

            rs.beforeFirst();
            if (checkAmount && checksendAcc && checkReceAcc && checkPin && checkLess) {
                String sendAmntQuery = "update account set amount  = amount - ? where accountnumber = ?";
                ps = con.prepareStatement(sendAmntQuery);

                ps.setDouble(1, amount);
                ps.setInt(2, Integer.parseInt(sendAcc));

                checktransaction = ps.executeUpdate();

                String receAmntQuery = "update account set amount  = amount + ? where accountnumber = ?";
                ps = con.prepareStatement(receAmntQuery);

                ps.setDouble(1, amount);
                ps.setInt(2, Integer.parseInt(recAcc));

                checktransaction = ps.executeUpdate();

                Double totalAmnt = 0.0;
                while (rs.next()) {
                    if (rs.getInt(1) == Integer.parseInt(sendAcc)) {
                        totalAmnt = rs.getDouble(17) - amount;
                    }
                }

                // create account date:
                Date currentDate = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String date = dateFormat.format(currentDate);
                java.util.Date date1 = dateFormat.parse(date);
                java.sql.Date sqlStartDate = new java.sql.Date(date1.getTime());

//                // transaction table update 
                String transactionQuery = "insert into transaction(date, transfer, receiver, debitAmount , totalbalance) values(?,?,?,?,?)";

                ps = con.prepareStatement(transactionQuery);

                ps.setDate(1, sqlStartDate);
                ps.setInt(2, Integer.parseInt(sendAcc));
                ps.setInt(3, Integer.parseInt(recAcc));
                ps.setDouble(4, amount);
                ps.setDouble(5, totalAmnt);

                ps.executeUpdate();
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
        return checktransaction;
    }

    //=========================================HISTORY=========================================
    public static int transactionHistory(String accNum) {
        Connection con = null;
        int checkHistory = -1;

        try {
            con = DatabaseConnect.getConnection();
            String showDataQuery = "select * from transaction where transfer = ? or receiver = ?";

            PreparedStatement ps = con.prepareStatement(showDataQuery);

            ps.setString(1, accNum);
            ps.setString(2, accNum);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                checkHistory++;
                System.out.println("\t\t\t\t\t\t\t ===========================================");
                System.out.println("\t\t\t\t\t\t\t\t\t Date \t\t" + rs.getDate(1));
                System.out.println("\t\t\t\t\t\t\t\t\t Transfer \t" + rs.getInt(2));
                System.out.println("\t\t\t\t\t\t\t\t\t Receiver \t" + rs.getInt(3));
                if (rs.getDouble(4) != 0.0) {
                    System.out.println("\t\t\t\t\t\t\t\t\t CreditAmount \t" + rs.getDouble(4));
                } else {
                    System.out.println("\t\t\t\t\t\t\t\t\t DebitAmount \t" + rs.getDouble(5));
                }
                System.out.println("\t\t\t\t\t\t\t\t\t TotalAmount \t" + rs.getDouble(6));
                System.out.println("\t\t\t\t\t\t\t ===========================================\n");

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return checkHistory;
        }
    }

}
