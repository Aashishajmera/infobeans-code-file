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
    private String pin;

    // default constructor
    public Account() {
    }

    // full constructor
    public Account(Integer accountNum, String firstName, String lastName, String fatherName, String contactNo, String email, String dateOfBirth, String aadharNumber, String panNumber, String accountType, String branch, String gender, String nominee, String address, Double amount, Boolean toActive, String pin) {
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
        this.pin = pin;
    }

    //without accountNumber & toActive
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

    // without account number: 
    public Account(String firstName, String lastName, String fatherName, String contactNo, String email, String dateOfBirth, String aadharNumber, String panNumber, String accountType, String branch, String gender, String nominee, String address, Double amount, Boolean toActive, String pin) {
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
        this.pin = pin;
    }

    public Integer getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNominee() {
        return nominee;
    }

    public void setNominee(String nominee) {
        this.nominee = nominee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getToActive() {
        return toActive;
    }

    public void setToActive(Boolean toActive) {
        this.toActive = toActive;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

}
