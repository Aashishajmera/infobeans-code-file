/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankProject;

import java.io.Serializable;

public class Pojo implements Serializable {

    // Color
    static String setRed = "\u001B[31m";
    static String setBlue = "\u001B[34m";
    static String setGreen = "\u001B[32m";
    static String resetColor = "\u001B[0m";

    // user document info
    private String userName;
    private String fatherName;
    private String aadharNum;
    private String moNumber;
    private String dateofbirth;
    private String pinNum;
    private float amount;
    private String accountNum;

    public Pojo(String userName, String fatherName, String aadharNum, String moNumber, String dateofbirth, String pinNum, float amount, String accountNum) {
        this.userName = userName;
        this.fatherName = fatherName;
        this.aadharNum = aadharNum;
        this.moNumber = moNumber;
        this.dateofbirth = dateofbirth;
        this.pinNum = pinNum;
        this.amount = amount;
        this.accountNum = accountNum;
    }

    public Pojo() {
    }

    public static String getSetRed() {
        return setRed;
    }

    public static void setSetRed(String setRed) {
        Pojo.setRed = setRed;
    }

    public static String getSetBlue() {
        return setBlue;
    }

    public static void setSetBlue(String setBlue) {
        Pojo.setBlue = setBlue;
    }

    public static String getSetGreen() {
        return setGreen;
    }

    public static void setSetGreen(String setGreen) {
        Pojo.setGreen = setGreen;
    }

    public static String getResetColor() {
        return resetColor;
    }

    public static void setResetColor(String resetColor) {
        Pojo.resetColor = resetColor;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPinNum() {
        return pinNum;
    }

    public void setPinNum(String pinNum) {
        this.pinNum = pinNum;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAadharNum() {
        return aadharNum;
    }

    public void setAadharNum(String aadharNum) {
        this.aadharNum = aadharNum;
    }

    public String getMoNumber() {
        return moNumber;
    }

    public void setMoNumber(String moNumber) {
        this.moNumber = moNumber;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getAccountNum() {
        return pinNum;
    }

    public void setAccountNum(String pinNum) {
        this.pinNum = pinNum;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
}