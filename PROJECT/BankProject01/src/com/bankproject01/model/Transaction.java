package com.bankproject01.model;

public class Transaction {

    private String date;
    private String transfer;
    private String receiver;
    private Double creditAmount;
    private Double debitAmount;
    private Double totalbalance;
    private String account_no;

    // full constructor
    public Transaction(String date, String transfer, String receiver, Double creditAmount, Double debitAmount, Double totalbalance, String account_no) {
        this.date = date;
        this.transfer = transfer;
        this.receiver = receiver;
        this.creditAmount = creditAmount;
        this.debitAmount = debitAmount;
        this.totalbalance = totalbalance;
        this.account_no = account_no;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(Double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public Double getTotalbalance() {
        return totalbalance;
    }

    public void setTotalbalance(Double totalbalance) {
        this.totalbalance = totalbalance;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

}
