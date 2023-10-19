package com.bankproject01.model;

public class Account {

    private Integer accountNum;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String contactNo;
    private String email;
    private String dateOfBirth;
    private String aadharNumber;
    private String panNumber;
    private String accountType;
    private String branch;
    private String gender;
    private String nominee;
    private String address;
    private Double amount;
    private Boolean toActive;

    public Account() {
    }

    public Account(Integer accountNum, String firstName, String lastName, String fatherName, String contactNo, String email, String dateOfBirth, String aadharNumber, String panNumber, String accountType, String branch, String gender, String nominee, String address, Double amount, Boolean toActive) {
        this.accountNum = accountNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.contactNo = contactNo;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.accountType = accountType;
        this.branch = branch;
        this.gender = gender;
        this.nominee = nominee;
        this.address = address;
        this.amount = amount;
        this.toActive = toActive;
    }

    public Account(String firstName, String lastName, String fatherName, String contactNo, String email, String dateOfBirth, String aadharNumber, String panNumber, String accountType, String branch, String gender, String nominee, String address, Double amount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.contactNo = contactNo;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.accountType = accountType;
        this.branch = branch;
        this.gender = gender;
        this.nominee = nominee;
        this.address = address;
        this.amount = amount;
    }

    
    
    
}
