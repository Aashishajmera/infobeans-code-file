import java.util.Scanner;

class Pojo {

  private int arr[] = new int[100];

  // default constructor:
  public Pojo() {}

  // perameterized constructor:
  public Pojo(int arr[]) {
    this.arr = arr;
  }

  // set array element:
  public void setElement(int arr[]) {
    this.arr = arr;
  }

  // getElement
  public int[] getElement() {
    return this.arr;
  }
}

//------------------------------------------------------------------------EXCEPTION-CLASS------------------------------------------------------------------------
class NegativeValueException extends Exception {

  // default constructor:
  NegativeValueException(String msg) {
    super(msg);
  }
}

//------------------------------------------------------------------------OPERATION-CLASS------------------------------------------------------------------------
class Operation {

  int arr[] = new int[100];
  int size = 0;

  //create object of pojo class:
  Pojo objP;

  //===============================================================================================================================================================
  // Enter size method:
  public void enterEle(Scanner sc) {
    boolean flag = true, flag2 = true, flag3 = true, flag4 = true;
    System.out.println("Enter size: ");
    do {
      try {
        if (flag2) {
          size = sc.nextInt();
          if (size < 0 || size > 100 || size == -0) {
            throw new NegativeValueException("Negative value is not allow: ");
          } else {
            flag2 = false;
            flag = false;
          }
        }
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < size; i++) {
          do {
            try {
              if (flag3) {
                arr[i] = sc.nextInt();
                flag4 = false;
                flag = false;
              }
            } catch (Exception e) {
              if (e.getClass().getName().contains("InputMismatchException")) {
                System.out.println("please re-enter number: (only integer)");
                sc.nextLine();
                flag4 = true;
              }
            }
          } while (flag4);
        }
      } catch (Exception e) {
        if (e.getClass().getName().contains("InputMismatchException")) {
          System.out.println("please re-enter element only integer value: ");
          sc.nextLine();
          flag2 = true;
          flag = true;
        } else if (e.getClass().getName().contains("NegativeValueException")) {
          System.out.println(
            "please re-enter positive element and  less than 100: "
          );
          sc.nextLine();
          flag2 = true;
          flag = true;
        }
      }
    } while (flag);

    // create object of pojo class:
    objP = new Pojo(arr);
    // get element:
    int arr2[] = objP.getElement();
    System.out.println("Default array element is: ");
    for (int i = 0; i < size; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println();
  }

  //===================================================================================================================================================
  public void InsertElement(Scanner sc) {
    int arr3[] = new int[size];
    int rSize = size;

    boolean flag = true, flag2 = true, flag3 = true, flag4 = true, flag5 = true;
    int index = -1, element = -1;
    System.out.println("Enter index ");
    do {
      try {
        if (flag2) {
          index = sc.nextInt();
          if (index < 0 || index > 100 || size <= index || index == -0) {
            throw new NegativeValueException("Negative value is not allow: ");
          } else {
            flag2 = false;
            flag = false;
          }
        }
        System.out.println("Enter insert element: ");
        do {
          try {
            if (flag3) {
              element = sc.nextInt();
              flag3 = false;
              flag4 = false;
            }
            //+++++++++++++++++++++++++++++OPERATION-PERFORM+++++++++++++++++++++++++++++++++++++++++++
            for (int i = 0; i < size; i++) {
              if (index == i) {
                arr3[i] = element;
                rSize--;
              } else {
                arr3[i] = arr[i];
              }
            }

            //+++++++++++++++++++++++++++++DISPLAY-FINAL-RESULT-PERFORM+++++++++++++++++++++++++++++++++++++++++++
            objP.setElement(arr3);
            // print final ans
            int arr2[] = objP.getElement();
            System.out.println("Default array element is: ");
            for (int i = 0; i < size; i++) {
              System.out.print(arr2[i] + " ");
            }
          } catch (Exception e) {
            if (e.getClass().getName().contains("InputMismatchException")) {
              System.out.println("please enter only integer value: ");
              sc.nextLine();
              flag3 = true;
              flag4 = true;
            }
          }
        } while (flag4);
      } catch (Exception e) {
        if (e.getClass().getName().contains("InputMismatchException")) {
          System.out.println("please enter only integer value: ");
          sc.nextLine();
          flag2 = true;
          flag = true;
        } else if (e.getClass().getName().contains("NegativeValueException")) {
          System.out.println(
            "please re-enter index value and less than" + size
          );
          sc.nextLine();
          flag2 = true;
          flag = true;
        }
      }
    } while (flag);
  }
}

//------------------------------------------------------------------------MAIN-CLASS------------------------------------------------------------------------

public class IncertElem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // create object of operation class:
    Operation objO = new Operation();
    objO.enterEle(sc);

    objO.InsertElement(sc);
  }
}
