import java.util.Random;

public class Validation {

  public boolean checkEmail(String gmail) {
    if (gmail.contains("@gmail.com")) {
      return true;
    } else {
      return false;
    }
  }

  public boolean checkMobileNumber(String mobileNum) {
    boolean flag = false;
    if (mobileNum.length() <= 10) {
      flag = true;
    }
    if (flag) {
      boolean flag1 = false;
      for (int i = 0; i < mobileNum.length(); i++) {
        if ((int) mobileNum.charAt(i) < 48 || (int) mobileNum.charAt(i) > 57) {
          flag1 = true;
          break;
        }
      }
      if (flag1) {
        return flag;
      } else {
        return flag;
      }
    } else {
    return flag;

    }
  }

  public static void main(String[] args) {
    Validation objV = new Validation();
  }
}
