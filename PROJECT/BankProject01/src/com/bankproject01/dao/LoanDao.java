package com.bankproject01.dao;

import com.bankproject01.model.Loan;
import com.bankproject01.service.DatabaseConnect;
import com.bankproject01.testmain.TestMain;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class LoanDao {

    // check age 
    public static int checkAge(String date, String accountNum) {
        Connection con = null;
        int age = -1;
        try {
            con = DatabaseConnect.getConnection();
            String checkAgeQuery = "select * from account where accountNumber = ?";
            PreparedStatement ps = con.prepareStatement(checkAgeQuery);

            ps.setInt(1, Integer.parseInt(accountNum));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                LocalDate birthDate = LocalDate.parse(rs.getDate(8).toString());
                LocalDate today = LocalDate.parse(date);
                age = today.getYear() - birthDate.getYear();
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
        return age;
    }

    // personal loan for self employee
    public static int personalLoan(Loan loan) {
        Connection con = null;
        int checkLoan = -1;

        try {
            // convery string date to sql date
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = format.parse(loan.getDate());
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());

            con = DatabaseConnect.getConnection();
            String insertQury = "insert into loan(account_No,loanType,Occupation,companyName,Designation,salary,duration,amount,date,repayment,emi) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(insertQury);

            ps.setInt(1, Integer.parseInt(loan.getAccountNo()));
            ps.setString(2, loan.getLoanType());
            ps.setString(3, loan.getOccupation());
            ps.setString(4, loan.getCompanyName());
            ps.setString(5, loan.getDesignation());
            ps.setDouble(6, loan.getSalary());
            ps.setInt(7, loan.getDuration());
            ps.setDouble(8, loan.getAmount());
            ps.setDate(9, sqlStartDate);
            ps.setDouble(10, loan.getRepayment());
            ps.setDouble(11, loan.getEmi());

            checkLoan = ps.executeUpdate();

            // add loan amount in account table 
            if (AccountDao.addLoanAmount(loan.getAccountNo(), loan.getAmount()) == -1) {
                System.out.println(TestMain.setRed + "Something went wrong to update account balance " + TestMain.resetColor);
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
        return checkLoan;
    }

    // personal loan for business men
    public static int personalLoanForBusiness(Loan loan) {
        Connection con = null;
        int checkLoan = -1;

        try {
            // convery string date to sql date
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = format.parse(loan.getDate());
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());

            con = DatabaseConnect.getConnection();
            String insertQury = "insert into loan(account_No,loanType,Occupation,companyName,Designation,income,duration,amount,date,repayment,emi) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(insertQury);

            ps.setInt(1, Integer.parseInt(loan.getAccountNo()));
            ps.setString(2, loan.getLoanType());
            ps.setString(3, loan.getOccupation());
            ps.setString(4, loan.getCompanyName());
            ps.setString(5, loan.getDesignation());
            ps.setDouble(6, loan.getIncome());
            ps.setInt(7, loan.getDuration());
            ps.setDouble(8, loan.getAmount());
            ps.setDate(9, sqlStartDate);
            ps.setDouble(10, loan.getRepayment());
            ps.setDouble(11, loan.getEmi());

            checkLoan = ps.executeUpdate();

            // add loan amount in account table 
            if (AccountDao.addLoanAmount(loan.getAccountNo(), loan.getAmount()) == -1) {
                System.out.println(TestMain.setRed + "Something went wrong to update account balance " + TestMain.resetColor);
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
        return checkLoan;
    }

    // business loan for self employee
    public static int BusinessLoan(Loan loan) {
        Connection con = null;
        int checkLoan = -1;

        try {
            // convery string date to sql date
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = format.parse(loan.getDate());
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());

            con = DatabaseConnect.getConnection();
            String insertQury = "insert into loan(account_No,loanType,Occupation,companyName,Designation,salary,duration,amount,date,repayment,emi) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(insertQury);

            ps.setInt(1, Integer.parseInt(loan.getAccountNo()));
            ps.setString(2, loan.getLoanType());
            ps.setString(3, loan.getOccupation());
            ps.setString(4, loan.getCompanyName());
            ps.setString(5, loan.getDesignation());
            ps.setDouble(6, loan.getSalary());
            ps.setInt(7, loan.getDuration());
            ps.setDouble(8, loan.getAmount());
            ps.setDate(9, sqlStartDate);
            ps.setDouble(10, loan.getRepayment());
            ps.setDouble(11, loan.getEmi());

            checkLoan = ps.executeUpdate();

            // add loan amount in account table 
            if (AccountDao.addLoanAmount(loan.getAccountNo(), loan.getAmount()) == -1) {
                System.out.println(TestMain.setRed + "Something went wrong to update account balance " + TestMain.resetColor);
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
        return checkLoan;
    }

    // business loan for business man
    public static int businessLoanForBusiness(Loan loan) {
        Connection con = null;
        int checkLoan = -1;

        try {
            // convery string date to sql date
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = format.parse(loan.getDate());
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());

            con = DatabaseConnect.getConnection();
            String insertQury = "insert into loan(account_No,loanType,Occupation,companyName,Designation,income,duration,amount,date,repayment,emi) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(insertQury);

            ps.setInt(1, Integer.parseInt(loan.getAccountNo()));
            ps.setString(2, loan.getLoanType());
            ps.setString(3, loan.getOccupation());
            ps.setString(4, loan.getCompanyName());
            ps.setString(5, loan.getDesignation());
            ps.setDouble(6, loan.getIncome());
            ps.setInt(7, loan.getDuration());
            ps.setDouble(8, loan.getAmount());
            ps.setDate(9, sqlStartDate);
            ps.setDouble(10, loan.getRepayment());
            ps.setDouble(11, loan.getEmi());

            checkLoan = ps.executeUpdate();

            // add loan amount in account table 
            if (AccountDao.addLoanAmount(loan.getAccountNo(), loan.getAmount()) == -1) {
                System.out.println(TestMain.setRed + "Something went wrong to update account balance " + TestMain.resetColor);
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
        return checkLoan;
    }
}
