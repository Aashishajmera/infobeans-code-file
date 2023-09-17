import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {

  public void main() {
    Scanner sc = new Scanner(System.in);

    // create object of pojo class
    Pojo objP = new Pojo();

    // create a object of Admin class:
    Admin objA = new Admin();

    //create a object of Customer class:
    Customer objC = new Customer();

    do {
      System.out.println(
        "\t\t\t-------------------------------------------------------------------------------------------------------"
      );
      System.out.println(
        " \t\t\t PRESS 1: Addmin login \t\t\t PRESS 2: Customer login \t\t\t" +
        Pojo.setRed +
        " PRESS 3: Exit" +
        Pojo.resetColor
      );
      System.out.println(
        "\t\t\t-------------------------------------------------------------------------------------------------------"
      );

      try {
        int choice1 = sc.nextInt();

        switch (choice1) {
          case 1:
            System.out.println(
              Pojo.setYellow +
              "\t\t\t\t\t\t\t ***** ADMIN LOGIN PAGE *****\n\t " +
              Pojo.resetColor
            );
            boolean flag = objA.adminLogin(sc);
            boolean flag1 = true;

            do {
              if (flag) {
                System.out.println(
                  "\t\t\t-------------------------------------------------------------------------------------------------------"
                );
                System.out.println(
                  "\t\t\t PRESS 1: Create a new customer account \t\t\t PRESS 2: View any account information \t\t\t"
                );
                System.out.println(
                  "\t\t\t PRESS 3: Remove or Block account \t\t\t\t PRESS 4: View all account list \t\t\t"
                );
                System.out.println(
                  "\t\t\t PRESS 5: Update customer details \t\t\t\t PRESS 6: Back menu \t\t\t"
                );
                System.out.println(
                  Pojo.setRed +
                  "\t\t\t\t\t\t\t\t PRESS: 7 Exit program" +
                  Pojo.resetColor
                );
                System.out.println(
                  "\t\t\t-------------------------------------------------------------------------------------------------------"
                );

                try {
                  int choice2 = sc.nextInt();

                  switch (choice2) {
                    case 1:
                      objC.createCustomerAccount(sc, objC, objP);
                      break;
                    case 2:
                      objC.accountDetails(sc, objP);
                      break;
                    case 3:
                      break;
                    case 4:
                      break;
                    case 5:
                      break;
                    case 6:
                      flag1 = false;
                      break;
                    case 7:
                      System.out.println(
                        Pojo.setGreen +
                        "\t\t\t\t\t\t\t THANKS FOR VISITING OUR BANK " +
                        Pojo.resetColor
                      );
                      System.exit(0);
                      break;
                    default:
                      System.out.println(
                        Pojo.setRed +
                        "\t\t\t\t\t\t\t Something went wrong: " +
                        Pojo.resetColor
                      );
                      sc.nextLine();
                  }
                } catch (InputMismatchException e) {
                  System.out.println(
                    Pojo.setRed +
                    "\t\t\t\t\t\t\t Wrong input: (please re-enter your choice)" +
                    Pojo.resetColor
                  );
                } catch (Exception e) {
                  e.printStackTrace();
                }
              } else {
                break;
              }
            } while (flag1);

            break;
          case 2:
            break;
          case 3:
            System.exit(0);
            break;
          default:
            break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Wrong input please re-enter:");
      } catch (Exception e) {
        e.printStackTrace();
      }
    } while (true);
  }
}
