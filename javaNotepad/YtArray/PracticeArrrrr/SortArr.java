import java.util.Scanner;

// ----------------------------------------------------------------------POJO-CLASS------------------------------------------------------------------------

class SortArr {

  private byte arr[] = new byte[50];

  // create default constructor:
  public SortArr() {}

  // setter method:
  public void setElement(byte arr[]) {
    this.arr = arr;
  }

  // getter method:
  public byte[] getElement() {
    return this.arr;
  }
}

// ----------------------------------------------------------------------OPERATION-CLASS------------------------------------------------------------------------

class Operation {

  byte arr[] = new byte[50];
  byte size;

  // input element method:
  public void inputElement(Scanner sc) {
    boolean flag = true, flag2 = true, flag3 = true;
    do {
      try {
        if (flag2) {
          System.out.println("Enter array size between 1 to 50 : ");
          size = sc.nextByte();
          flag2 = false;
          flag = false;
        }
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < size; i++) {
          do {
            try {
              arr[i] = sc.nextByte();
              flag3 = false;
            } catch (Exception e) {
              if (e.getClass().getName().contains("InputMismatchException")) {
                System.out.println("Enter only integer value: ");
                sc.nextLine();
                flag3 = true;
              } else if (
                e
                  .getClass()
                  .getName()
                  .contains("ArrayIndexOutOfBoundsException")
              ) {
                System.out.println("Enter array size between 50");
                sc.nextLine();
                flag = true;
                flag2 = true;
                break;
              }
            }
          } while (flag3);
        }
      } catch (Exception e) {
        if (e.getClass().getName().contains("InputMismatchException")) {
          System.out.println("please re-enter size (only/integer)");
          sc.nextLine();
          flag = true;
          flag2 = true;
        }
      }
    } while (flag);

    // object of pojo/ sort array class:
    SortArr objS = new SortArr();
    objS.setElement(arr);
    System.out.println("Default array element is: ");
    byte arr2[] = objS.getElement();
    for (int i = 0; i < size; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          arr[j] = (byte) (arr[j] + arr[j + 1]);
          arr[j + 1] = (byte) (arr[j] - arr[j + 1]);
          arr[j] = (byte) (arr[j] - arr[j + 1]);
        }
      }
    }

    System.out.println("Decending element is: ");
    objS.setElement(arr);
    for (int i = 0; i < size; i++) {
      System.out.print(arr2[i] + " ");
    }
  }
}

//----------------------------------------------------------------------------MAIN-CLASS---------------------------------------------------------------------------

class TestMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // create a object of operation class
    Operation objO = new Operation();

    objO.inputElement(sc);
  }
}
