package com.bankproject01.model;

public class Admin {

    private int Id;
    private String fullName;
    private String dob;
    private String mobileNumber;
    private String email;
    private String Password;

    public Admin() {
    }

    // full constructor
    public Admin(int Id, String fullName, String dob, String mobileNumber, String email, String Password) {
        this.Id = Id;
        this.fullName = fullName;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.Password = Password;
    }

    public Admin(int Id, String Password) {
        this.Id = Id;
        this.Password = Password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
