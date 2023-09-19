import java.util.Scanner;

public class Validation {

  public boolean checkEmail(String gmail) {
    boolean flag = true;
    for (int i = 0; i < gmail.length(); i++) {
      if (
        gmail.charAt(i) >= 97 &&
        gmail.charAt(i) <= 122 ||
        gmail.charAt(i) > 47 &&
        gmail.charAt(i) < 58 ||
        gmail.charAt(i) == 64 ||
        gmail.charAt(i) == 46
      ) {
        flag = true;
      } else {
        flag = false;
        break;
      }
    }

    if (flag) {
      if (gmail.contains("@gmail.com")) {
        flag = true;
        return flag;
      } else {
        flag = false;
        return flag;
      }
    } else {
      return flag;
    }
  }

  public boolean checkMobileNumber(String mobileNum) {
    boolean flag = false;
    if (mobileNum.length() == 10) {
      flag = true;
    }
    if (flag) {
      for (int i = 0; i < mobileNum.length(); i++) {
        if (mobileNum.charAt(i) > 47 || mobileNum.charAt(i) < 58) {
          flag = true;
        } else {
          flag = false;
          break;
        }
      }
      if (flag) {
        return flag;
      } else {
        return flag;
      }
    } else {
      return flag;
    }
  }

  public boolean checkName(String name) {
    boolean flag = false;
    for (int i = 0; i < name.length(); i++) {
      if (
        name.charAt(i) >= 65 &&
        name.charAt(i) <= 90 ||
        name.charAt(i) >= 97 &&
        name.charAt(i) <= 122 ||
        name.charAt(i) == 32
      ) {
        flag = true;
      } else {
        flag = false;
        break;
      }
    }

    if (flag) {
      return flag;
    } else {
      return flag;
    }
  }

  public boolean checkAadharNum(String aadharNum) {
    boolean flag = false;
    if (aadharNum.length() == 12) {
      flag = true;
    }

    if (flag) {
      for (int i = 0; i < aadharNum.length(); i++) {
        if (aadharNum.charAt(i) > 47 && aadharNum.charAt(i) < 58) {
          flag = true;
        } else {
          flag = false;
          break;
        }
      }
      return flag;
    } else {
      return flag;
    }
  }

  public boolean checkPancardNum(String pancardNum) {
    boolean flag = false;
    if (pancardNum.length() == 10) {
      flag = true;
    }

    if (flag) {
      for (int i = 0; i < pancardNum.length(); i++) {
        if (i <= 4) {
          if (pancardNum.charAt(i) >= 65 && pancardNum.charAt(i) <= 90) {
            flag = true;
          } else {
            flag = false;
            break;
          }
        } else if (i >= 5 && i <= 8) {
          if (pancardNum.charAt(i) > 47 && pancardNum.charAt(i) < 58) {
            flag = true;
          } else {
            flag = false;
            break;
          }
        } else {
          if (pancardNum.charAt(i) >= 65 && pancardNum.charAt(i) <= 90) {
            flag = true;
          } else {
            flag = false;
            break;
          }
        }
      }
      return flag;
    } else {
      return flag;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter mail");
    String mail = sc.nextLine();

    Validation objV = new Validation();
    if (objV.checkEmail(mail)) {
      System.out.println("Valid mail");
    } else {
      System.out.println("Invalid mail: ");
    }

    System.out.println("Enter mobile number: ");
    String num = sc.nextLine();

    if (objV.checkMobileNumber(num)) {
      System.out.println("Valid mobile number: ");
    } else {
      System.out.println("Invalid mobile number: ");
    }

    System.out.println("Enter name: ");
    String name = sc.nextLine();

    if (objV.checkName(name)) {
      System.out.println("Valid name: ");
    } else {
      System.out.println("Invalid name: ");
    }

    System.out.println("Enter aadhar number: ");
    String aadharNum = sc.nextLine();

    if (objV.checkAadharNum(aadharNum)) {
      System.out.println("Valid aadhar number: ");
    } else {
      System.out.println("Invalid aadhar number: ");
    }

    System.out.println("Enter panCard number: ");
    String panNum = sc.nextLine();

    if(objV.checkPancardNum(panNum)){
      System.out.println("Valid panCard number: ");
    }else{
      System.out.println("Invalid pancard number: ");
    }
  }
}
