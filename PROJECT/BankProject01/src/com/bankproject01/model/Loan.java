package com.bankproject01.model;

public class Loan {

    private String accountNo;
    private String loanType;
    private String occupation;
    private String companyName;
    private String Designation;
    private Double salary;
    private Double income;
    private Integer duration;
    private Double amount;
    private String date;
    private Double repayment;
    private Double emi;

    // full constructor
    public Loan(String accountNo,  String loanType, String occupation, String companyName, String Designation, Double salary, Double income, Integer duration, Double amount, String date, Double repayment, Double emi) {
        this.accountNo = accountNo;
        this.loanType = loanType;
        this.occupation = occupation;
        this.companyName = companyName;
        this.Designation = Designation;
        this.salary = salary;
        this.income = income;
        this.duration = duration;
        this.amount = amount;
        this.date = date;
        this.repayment = repayment;
        this.emi = emi;
    }

    // personal loan constructor
    public Loan(String accountNo, String loanType, String occupation, String companyName, String Designation, Double salary, Integer duration, Double amount, String date, Double repayment, Double emi) {
        this.accountNo = accountNo;
        this.loanType = loanType;
        this.occupation = occupation;
        this.companyName = companyName;
        this.Designation = Designation;
        this.salary = salary;
        this.duration = duration;
        this.amount = amount;
        this.date = date;
        this.repayment = repayment;
        this.emi = emi;
    }

    public Loan() {

    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getRepayment() {
        return repayment;
    }

    public void setRepayment(Double repayment) {
        this.repayment = repayment;
    }

    public Double getEmi() {
        return emi;
    }

    public void setEmi(Double emi) {
        this.emi = emi;
    }

}
