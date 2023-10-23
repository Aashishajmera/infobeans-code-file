package com.bankproject01.model;

public class Admin {

    private int Id;
//    private String fullName;
//    private String dob;
//    private String mobileNumber;
//    private String email;
    private String Password;

    public Admin() {
    }

    public Admin(int Id, String Password) {
        this.Id = Id;
        this.Password = Password;
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
