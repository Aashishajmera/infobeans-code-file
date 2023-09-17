import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

// interface CustomerIntrfc {}

public class Customer {

  static int pin = 1001;

  //-----------------------------------------ACCOUNT-NUMBER-GENERATE-------------------------------------------
  public String accountNumberCreate() {
    String s = "180001802";

    String accountNum = s + pin;

    return accountNum;
  }

  //-----------------------------------------PIN-NUMBER-GENERATE-------------------------------------------

  public int pinCreate() {
    pin = pin + 1;
    System.out.println(pin);
    return pin;
  }

  // ------------------------------------------CREATE-CUSTUMER-ACCOUNT---------------------------------------------
  public void createCustomerAccount(Scanner sc, Customer objC, Pojo objP) {
    try {
      System.out.print("\t Enter your name: \n\t ");
      sc.nextLine();
      objP.setUserName(sc.nextLine());
      System.out.print("\t Enter your father name: \n\t ");
      objP.setFatherName(sc.nextLine());
      System.out.print("\t Date of birth: \n\t ");
      objP.setDateofbirth(sc.nextLine());
      System.out.print("\t Enter aadhar number: \n\t ");
      objP.setAadharNum(sc.nextLine());
      System.out.print("\t Enter panCard number: \n\t ");
      objP.setPanCardNum(sc.nextLine());
      System.out.print("\t Enter mobile number: \n\t ");
      objP.setMoNumber(sc.nextLine());
      System.out.print("\t Enter email: \n\t ");
      objP.setEmail(sc.nextLine());
      String line;

      boolean flag = false;

      File f = new File("userAcc.txt");

      FileReader fr = new FileReader(f);

      BufferedReader br = new BufferedReader(fr);

      //check aadhar number:
      while ((line = br.readLine()) != null) {
        String readData[] = line.split("\t");
        if (
          objP.getAadharNum().equals(readData[4]) ||
          objP.getEmail().equals(readData[6]) ||
          objP.getMoNumber().equals(readData[3]) ||
          objP.getPanCardNum().equals(readData[5])
        ) {
          System.out.println(
            Pojo.setRed +
            "\t\t\t\t\t\t\tSomething went wrong: " +
            Pojo.resetColor
          );
        } else {
          {
            System.out.print("\t Enter amount: \n\t ");
            objP.setAmount(sc.nextDouble());

            if (objP.getAmount() >= 1000) {
              int pin2 = objC.pinCreate();
              String accountNum2 = objC.accountNumberCreate();

              objP.setPinNum(pin2);
              objP.setAccountNum(accountNum2);

              this.pin = objP.getPinNum();

              System.out.println(
                Pojo.setGreen +
                "\t\t\t\t\t\t\t Congractulation your account successfully created...\n" +
                Pojo.resetColor
              );

              if (!f.exists()) {
                f.createNewFile();
              }

              FileWriter fw = new FileWriter(f, true);

              BufferedWriter bw = new BufferedWriter(fw);
              bw.write(objP.getAccountNum() + "\t");
              bw.write(objP.getUserName() + "\t");
              bw.write(objP.getFatherName() + "\t");
              bw.write(objP.getMoNumber() + "\t");
              bw.write(objP.getAadharNum() + "\t");
              bw.write(objP.getPanCardNum() + "\t");
              bw.write(objP.getEmail() + "\t");
              bw.write(objP.getDateofbirth() + "\t");
              bw.write(objP.getAmount() + "\t");
              bw.write(objP.getPinNum() + "\t");
              bw.write("\n");
              bw.close();
            } else {
              System.out.println(
                Pojo.setRed +
                "Please enter minimum amount 1000 rupes..." +
                Pojo.resetColor
              );
            }
          }
        }
      }
    } catch (InputMismatchException e) {
      System.out.println(
        Pojo.setRed +
        "\t\t\t\t\t\tWrong input: (please re-enter your choice)" +
        Pojo.resetColor
      );
      sc.nextLine();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // -------------------------------------------CUSTUMER-ACCOUNT-DETAILS-READ--------------------------------------------
  public void accountDetails(Scanner sc, Pojo objp) {
    File f = new File("userAcc.txt");
    String AccountNumber = null;
    try {
      FileReader fr = new FileReader(f);

      BufferedReader br = new BufferedReader(fr);

      System.out.print("\t Enter account number: \n\t ");
      sc.nextLine();
      AccountNumber = sc.nextLine();

      String line;
      Boolean flag = true;
      while ((line = br.readLine()) != null) {
        String readData[] = line.split("\t");
        if (AccountNumber.equals(readData[0])) {
          System.out.println(
            Pojo.setYellow +
            "\t\t\t\t\t\t\t\t ACCOUNT-INFORMATION" +
            Pojo.resetColor
          );
          System.out.println(
            "\t\t\t\t\t\t\t ============================================"
          );
          System.out.println("\t\t\t\t\t\t\t\tAccount number:  " + readData[0]);
          System.out.println("\t\t\t\t\t\t\t\tHolder's name:   " + readData[1]);
          System.out.println("\t\t\t\t\t\t\t\tFather name: \t " + readData[2]);
          System.out.println("\t\t\t\t\t\t\t\tMobile number:   " + readData[3]);
          System.out.println("\t\t\t\t\t\t\t\tAadhar number:   " + readData[4]);
          System.out.println("\t\t\t\t\t\t\t\tPanCard number:  " + readData[5]);
          System.out.println("\t\t\t\t\t\t\t\tEmail: \t\t " + readData[6]);
          System.out.println("\t\t\t\t\t\t\t\tDOB:  \t\t " + readData[7]);
          System.out.println("\t\t\t\t\t\t\t\tAmount: \t " + readData[8]);

          System.out.println(
            "\t\t\t\t\t\t\t ============================================"
          );
          flag = false;
        }
      }

      fr.close();
      br.close();
      if (flag) {
        System.out.println(
          Pojo.setRed + "\t\t\t\t\t\t\t\t Account not found: " + Pojo.resetColor
        );
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    // break;
  }
}
