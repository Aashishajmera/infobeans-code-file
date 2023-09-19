public class Pojo {

  // Color
  static String setRed = "\u001B[31m";
  static String setYellow = "\u001B[33m";
  static String setGreen = "\u001B[32m";
  static String resetColor = "\u001B[0m";

  private String userName;
  private String fatherName;
  private String aadharNum;
  private String moNumber;
  private String dateofbirth;
  private String pinNum;
  private String accountNum;
  private String email;
  private String panCardNum;
  private String accountType;
  private double amount;

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
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

  public String getPinNum() {
    return pinNum;
  }

  public void setPinNum(String pinNum) {
    this.pinNum = pinNum;
  }

  public String getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPanCardNum() {
    return panCardNum;
  }

  public void setPanCardNum(String panCardNum) {
    this.panCardNum = panCardNum;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
}
