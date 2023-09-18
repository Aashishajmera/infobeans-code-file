public class Vlidation {

  public void checkEmail() {}

  public boolean checkMobileNumber(String mobileNum) {
    boolean flag = false;
    if (mobileNum.length() <= 10) {
      flag = true;
    }
    for(int i= 1; i <= 10; i++){
        // mobileNum.charAt(i).equals();
    }
    return flag ;
  }
}
