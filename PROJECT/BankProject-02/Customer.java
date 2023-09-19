import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

// interface CustomerIntrfc {}

public class Customer {

  //----------------------------------------------LOGIN-USERACCOUNT---------------------------------------------------
  public String loginUserAccound(Scanner sc) {
    // File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\BankProject\\userAcc.txt");
    Boolean flag = false;
    String name = null;
    String accountNum = null;

    try {
      FileReader fr = new FileReader("userAcc.txt");

      BufferedReader br = new BufferedReader(fr);

      System.out.print("\t Enter Holder's number:  \n\t ");
      sc.nextLine();
      name = sc.nextLine();
      System.out.print("\t Enter account number:  \n\t ");
      accountNum = sc.nextLine();

      String line;
      while ((line = br.readLine()) != null) {
        String readData[] = line.split("\t");
        if (accountNum.equals(readData[0]) && name.equals(readData[1])) {
          System.out.println(
            Pojo.setGreen +
            "\t\t\t\t\t\t\t\t LOGIN SUCCESSFULL " +
            Pojo.resetColor
          );
          return accountNum;
        }
      }
      fr.close();
      br.close();
      return accountNum = null;
    } catch (Exception e) {
      e.printStackTrace();
      return accountNum = null;
    }
  }

  //-----------------------------------------------USER-ACCOUNT-DETAILS-CASE2-------------------------------------

  public void userAccountDetailsC(String accountNum) {
    try {
      FileReader fr = new FileReader("userAcc.txt");

      BufferedReader br = new BufferedReader(fr);

      String line;
      while ((line = br.readLine()) != null) {
        String readData[] = line.split("\t");
        if (accountNum.equals(readData[0])) {
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
            "\t\t\t\t\t\t\t\tAccount type:    " + readData[10]
          );

          System.out.println(
            "\t\t\t\t\t\t\t ============================================"
          );
        }
      }
      fr.close();
      br.close();
    } catch(InputMismatchException e){
      System.out.println(Pojo.setRed+"\t\t\t\t\t\t\t Wrong input (please re-enter)"+Pojo.resetColor);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
