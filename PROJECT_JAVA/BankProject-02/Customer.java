import java.io.BufferedReader;
import java.io.BufferedWriter;
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
//---------------------------------------------UPDATE-ACCOUNT-DETAILS----------------------------------------------
  public void updateAccountDetails(Pojo objP, Scanner sc, Validation objV) {
    try {
      FileReader fr = new FileReader("userAcc.txt");

      BufferedReader br = new BufferedReader(fr);

      // write new data in new file:
      FileWriter fw = new FileWriter("userAcc1.txt");
      BufferedWriter bw = new BufferedWriter(fw);

      System.out.print("\t Enter Holder's name: \n\t ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("\t Enter account number: \n\t ");
      String accountNum = sc.nextLine();
      boolean flag = false;

      String line;
      while ((line = br.readLine()) != null) {
        String readData[] = line.split("\t");
        if (name.equals(readData[1]) && accountNum.equals(readData[0])) {
          flag = true;
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

          try {
            System.out.println(
              Pojo.setRed +
              "\t\t\t\t\t\t\t Do you want to change account details(y/n) " +
              Pojo.resetColor
            );
            char total = sc.next().charAt(0);

            if (total == 'y') {
              // setaccount number:
              bw.write(readData[0] + "\t");

              System.out.print(
                "\t Do you want to change your name: (y/n) \n\t "
              );
              char checkName = sc.next().charAt(0);
              if (checkName == 'y') {
                System.out.print("\t Enter update name: \n\t ");
                sc.nextLine();
                objP.setUserName(sc.nextLine());
                bw.write(objP.getUserName() + "\t");
              } else {
                bw.write(readData[1] + "\t");
              }
              bw.write(readData[2] + "\t");
              System.out.print(
                "\t Do you want to change your Mobile number (y/n) \n\t "
              );
              char changeMobileNum = sc.next().charAt(0);

              if (changeMobileNum == 'y') {
                System.out.print("\t Enter your update mobile number: \n\t ");
                sc.nextLine();
                objP.setMoNumber(sc.nextLine());
                bw.write(objP.getMoNumber() + '\t');
              } else {
                bw.write(readData[3] + "\t");
              }
              bw.write(readData[4] + "\t");
              bw.write(readData[5] + "\t");
              System.out.print(
                "\t Do you want to change your email: (y/n) \n\t "
              );
              char changeEmail = sc.next().charAt(0);
              if (changeEmail == 'y') {
                System.out.print("\t Enter your update email: \n\t ");
                sc.nextLine();
                objP.setEmail(sc.nextLine());
                bw.write(objP.getEmail() + "\t");
              } else {
                bw.write(readData[6] + "\t");
              }
              System.out.print(
                "\t Do you want to change your DOB: (y/n) \n\t "
              );
              char changeDob = sc.next().charAt(0);
              if (changeDob == 'y') {
                System.out.print("\t Enter your update DOB: \n\t ");
                sc.nextLine();
                objP.setDateofbirth(sc.nextLine());
                bw.write(objP.getDateofbirth() + "\t");

                System.out.println(
                  Pojo.setGreen +
                  "\t\t\t\t\t\t\t\tAccount successfully update..." +
                  Pojo.resetColor
                );
              } else {
                bw.write(readData[7] + "\t");
                System.out.println(
                  Pojo.setGreen +
                  "\t\t\t\t\t\t\t\tAccount successfully update..." +
                  Pojo.resetColor
                );
              }
              bw.write(readData[8] + "\t");
              bw.write(readData[9] + "\t");
              bw.write(readData[10] + "\t");
              bw.write("\n");
            } else {
              bw.write(readData[0] + "\t");
              bw.write(readData[1] + "\t");
              bw.write(readData[2] + "\t");
              bw.write(readData[3] + "\t");
              bw.write(readData[4] + "\t");
              bw.write(readData[5] + "\t");
              bw.write(readData[6] + "\t");
              bw.write(readData[7] + "\t");
              bw.write(readData[8] + "\t");
              bw.write(readData[9] + "\t");
              bw.write(readData[10] + "\t");
              bw.write("\n");

              System.out.println(
                Pojo.setGreen +
                "\t\t\t\t\t\t\t\t   Back to menu" +
                Pojo.resetColor
              );
            }
          } catch (InputMismatchException e) {
            System.out.println(
              Pojo.setRed +
              "\t\t\t\t\t\t Wrong input please (re-enter)" +
              Pojo.resetColor
            );
          } catch (Exception e) {
            e.printStackTrace();
          }
        } else {
          bw.write(readData[0] + "\t");
          bw.write(readData[1] + "\t");
          bw.write(readData[2] + "\t");
          bw.write(readData[3] + "\t");
          bw.write(readData[4] + "\t");
          bw.write(readData[5] + "\t");
          bw.write(readData[6] + "\t");
          bw.write(readData[7] + "\t");
          bw.write(readData[8] + "\t");
          bw.write(readData[9] + "\t");
          bw.write(readData[10] + "\t");
          bw.write("\n");
        }
      }

      bw.close();

      fr.close();
      br.close();
      fw.close();
      bw.close();

      // File f = new File("userAcc.txt");
      // f.delete();
      // File fold = new File("userAcc.txt");
      // File fnew = new File("userAcc1.txt");
      // fnew.renameTo(fold);

      objV.renameDelete();

      if (flag == false) {
        System.out.println(
          Pojo.setRed + "\t\t\t\t\t\t\t\t Account not found: " + Pojo.resetColor
        );
      }

      fr.close();
      br.close();
    } catch (InputMismatchException e) {
      sc.nextLine();
      System.out.println(
        Pojo.setRed +
        "\t\t\t\t\t\t Wrong input please (re-enter)" +
        Pojo.resetColor
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }



}
