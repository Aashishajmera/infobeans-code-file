import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

interface AdminIntrfc {
  boolean adminLogin(Scanner sc);
}

public class Admin implements AdminIntrfc {

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
            "\t\t\t\t\t\t\t\t LOGIN SUCCESSFULL " +
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
}
