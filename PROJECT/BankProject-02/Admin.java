import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

interface AdminIntrfc {
  boolean adminLogin(Scanner sc);
}

public class Admin implements AdminIntrfc {

  static int pin = 1001;

  //-----------------------------------------ADMIN-LOGIN------------------------------------------------
  public boolean adminLogin(Scanner sc) {
    // create a file of adminLogin class:
    File fadmin = new File("Admin.txt");
    boolean flag = false;

    try {
      FileReader fr = new FileReader(fadmin);
      sc.nextLine();
      System.out.print("\t Enter your name: \n\t ");
      String name = sc.nextLine();
      System.out.print("\t Enter password: \n\t ");

      Console console = System.console();
      char[] chars = console.readPassword();
      String password = new String(chars);

      BufferedReader br = new BufferedReader(fr);
      if (br.readLine().equals(name)) {
        if (br.readLine().equals(password)) {
          System.out.println(
            Pojo.setGreen +
            "\t\t\t\t\t\t\t\t ADMIN LOGIN SUCCESSFULL " +
            Pojo.resetColor
          );
          flag = true;
        } else {
          System.out.println(Pojo.setRed + "Wrong password" + Pojo.resetColor);
        }
      } else {
        System.out.println(Pojo.setRed + "Wrong name...." + Pojo.resetColor);
      }
      fr.close();
      br.close();
      return flag;
    } catch (Exception e) {
      e.printStackTrace();
      return flag;
    }
  }

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
  public void createCustomerAccount(Scanner sc, Admin objA, Pojo objP) {
    try {
      System.out.print("\t Account type(saving/current) \n\t ");
      sc.nextLine();
      objP.setAccountType(sc.nextLine());

      if (
        objP.getAccountType().equals("saving") ||
        objP.getAccountType().equals("current")
      ) {
        System.out.print("\t Enter your name: \n\t ");
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

        FileReader fr = new FileReader("userAcc.txt");

        BufferedReader br = new BufferedReader(fr);

        //check aadhar number:
        while ((line = br.readLine()) != null) {
          String readData[] = line.split("\t");
          if (objP.getAadharNum().equals(readData[4])) {
            System.out.println(
              Pojo.setRed +
              "\t\t\t\t\t\t\t\t Aadhar number same:  " +
              Pojo.resetColor
            );
            flag = true;
            break;
          } else if (objP.getEmail().equals(readData[6])) {
            System.out.println(
              Pojo.setRed + "\t\t\t\t\t\t\t\t same email:  " + Pojo.resetColor
            );
            flag = true;
            break;
          } else if (objP.getMoNumber().equals(readData[3])) {
            System.out.println(
              Pojo.setRed +
              "\t\t\t\t\t\t\t\t Mobile number same:  " +
              Pojo.resetColor
            );
            flag = true;
            break;
          } else if (objP.getPanCardNum().equals(readData[5])) {
            System.out.println(
              Pojo.setRed +
              "\t\t\t\t\t\t\t\t PanCard number same:  " +
              Pojo.resetColor
            );
            flag = true;
            break;
          }
        }

        if (flag == false) {
          {
            System.out.print("\t Enter amount: \n\t ");
            objP.setAmount(sc.nextDouble());

            if (objP.getAmount() >= 1000) {
              int pin2 = objA.pinCreate();
              String accountNum2 = objA.accountNumberCreate();

              objP.setPinNum(pin2);
              objP.setAccountNum(accountNum2);

              this.pin = objP.getPinNum();

              System.out.println(
                Pojo.setRed +
                "\t\t\t\t\t\t\t\t !! Warning Do not share OTP !!\n" +
                Pojo.resetColor
              );

              System.out.println(
                Pojo.setGreen +
                "\t\t\t\t\t\t\t Congractulation your account successfully created...\n" +
                Pojo.resetColor
              );

              FileWriter fw = new FileWriter("userAcc.txt", true);

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
              bw.write(objP.getAccountType() + "\t");
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
      } else {
        System.out.println(
          Pojo.setRed +
          "\t\t\t\t\t\tPlease enter right account type: (current/saving)" +
          Pojo.resetColor
        );
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
    String AccountNumber = null;
    String name = null;
    try {
      FileReader fr = new FileReader("userAcc.txt");

      BufferedReader br = new BufferedReader(fr);
      System.out.print("\t Enter Holder's name: \n\t ");
      sc.nextLine();
      name = sc.nextLine();
      System.out.print("\t Enter account number: \n\t ");
      AccountNumber = sc.nextLine();

      String line;
      Boolean flag = true;
      while ((line = br.readLine()) != null) {
        String readData[] = line.split("\t");
        if (AccountNumber.equals(readData[0]) && name.equals(readData[1])) {
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

  //-------------------------------------------VIEW-ALL-ACCOUNT-INFORMATION-------------------------------------------------
  public void allAccountInformation() {
    try {
      FileReader fr = new FileReader("userAcc.txt");

      BufferedReader br = new BufferedReader(fr);

      String line;
      Boolean flag = true;
      int n = 1;
      while ((line = br.readLine()) != null) {
        String readData[] = line.split("\t");
        System.out.println(
          Pojo.setYellow +
          "\t\t\t\t\t\t\t\t" +
          n +
          " ACCOUNT-INFORMATION" +
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
        System.out.println("\t\t\t\t\t\t\t\tAccount type:    " + readData[10]);

        System.out.println(
          "\t\t\t\t\t\t\t ============================================"
        );
        flag = false;
        n++;
      }
      fr.close();
      br.close();
      if (flag) {
        System.out.println(
          Pojo.setRed + "\t\t\t\t\t\t\t\t Account not found: "
        );
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  //----------------------------------------------REMOVE-AND-BLOCK-ACCOUNT-----------------------------------------------------
  public void removeAndBlock(Scanner sc) {
    String accountNum = null;
    String name = null;
    try {
      //read data in file :
      FileReader fr = new FileReader("userAcc.txt");
      BufferedReader br = new BufferedReader(fr);

      // write new data in new file:
      FileWriter fw = new FileWriter("userAcc1.txt");
      BufferedWriter bw = new BufferedWriter(fw);

      System.out.print("\t Enter Holder's name: \n\t ");
      sc.nextLine();
      name = sc.nextLine();
      System.out.print("\t Enter Account number: \n\t ");
      accountNum = sc.nextLine();

      String line;
      Boolean flag = true;
      while ((line = br.readLine()) != null) {
        String readData[] = line.split("\t");
        if (accountNum.equals(readData[0]) && name.equals(readData[1])) {
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
          flag = false;

          System.out.println(
            Pojo.setRed +
            "\t\t\t\t\t\t\tDo you want to delete this account: (y/n)" +
            Pojo.resetColor
          );
          char ch = sc.next().charAt(0);
          if (ch == 'y') {
            System.out.println(
              Pojo.setGreen +
              "\t\t\t\t\t\t\t\tAccount successfully delete: " +
              Pojo.resetColor
            );
            continue;
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

      File f = null;
      f = new File("userAcc.txt");
      f.delete();
      File fold = new File("userAcc.txt");
      File fnew = new File("userAcc1.txt");
      fnew.renameTo(fold);
      if (flag) {
        System.out.println(
          Pojo.setRed + "\t\t\t\t\t\t\t\t Account not found: " + Pojo.resetColor
        );
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  //---------------------------------------------UPDATE-ACCOUNT-DETAILS----------------------------------------------
  public void updateAccountDetails(Pojo objP, Scanner sc) {
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

      File f = new File("userAcc.txt");
      f.delete();
      File fold = new File("userAcc.txt");
      File fnew = new File("userAcc1.txt");
      fnew.renameTo(fold);

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
