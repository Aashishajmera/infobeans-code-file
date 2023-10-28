//package com.bankproject01.dao;
//
//import com.bankproject01.service.DatabaseConnect;
//import com.bankproject01.testmain.TestMain;
//import java.sql.PreparedStatement;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class TransactionDao {
//
//// transaction 
//    public static void transactionCode(String sendAcc, String recAcc, Double amount) {
//        Connection con = null;
//        int checktransaction = -1;
//
//        try {
//            con = DatabaseConnect.getConnection();
//
//            String checkQuery = "select * from account";
//            PreparedStatement ps = con.prepareStatement(checkQuery);
//
//            ResultSet rs = ps.executeQuery();
//            boolean checksendAcc = false, checkReceAcc = false, checkAmount = false;
//
//            while (rs.next()) {
//                if (rs.getInt(1) == Integer.parseInt(sendAcc)) {
//                    checksendAcc = true;
//                    if (rs.getDouble(17) >= amount) {
//                        checkAmount = true;
//                    }
//                }
//            }
//
//            rs.beforeFirst();
//
//            while (rs.next() && (checksendAcc && checkReceAcc)) {
//                if (rs.getInt(1) == Integer.parseInt(recAcc)) {
//                    checkReceAcc = true;
//                }
//            }
//
//            // check condition 
//            if (!checksendAcc) {
//                System.out.println(TestMain.setRed + "Invalid sender account Number: " + TestMain.resetColor);
//            }
//            if (!checkAmount) {
//                System.out.println(TestMain.setRed + "Insufficient amount" + TestMain.resetColor);
//            }
//            if (!checkReceAcc) {
//                System.out.println(TestMain.setRed + "Invalid Receive account Number: " + TestMain.resetColor);
//            }
//
//            rs.beforeFirst();
//            if (checkAmount && checksendAcc && checkReceAcc) {
//                String sendAmntQuery = "update account set amount  = amount - ? where accountnumber = ?";
//
//                ps.setDouble(1, amount);
//                ps.setInt(2, Integer.parseInt(sendAcc));
//
//                ps.executeQuery();
//
//                String receAmntQuery = "update account set amount  = amount + ? where accountnumber = ?";
//
//                ps.setDouble(1, amount);
//                ps.setInt(2, Integer.parseInt(recAcc));
//
//                ps.executeQuery();
//
//                checktransaction++;
//
//                // create account date:
//                Date currentDate = new Date();
//                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//                String date = dateFormat.format(currentDate);
//                java.util.Date date1 = dateFormat.parse(date);
//                java.sql.Date sqlStartDate = new java.sql.Date(date1.getTime());
//
//                // transaction table update 
//                String transactionQuery = "insert into transaction(date, transfer, receiver, creditAmount, debitAmount, totalbalance) values(?,?,?,?,?,?)";
//                
//                ps.setDate(1, sqlStartDate);
//                ps.setInt(2, Integer.parseInt(sendAcc));
//                ps.setInt(3, Integer.parseInt(recAcc));
//                ps.setDouble(4, amount);
//                ps.setDouble(5, );
//            }
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
//    }
//
//}
