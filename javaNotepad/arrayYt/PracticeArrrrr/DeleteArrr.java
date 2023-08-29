import java.util.Scanner;
// ----------------------------------------------------------------------POJO-CLASS------------------------------------------------------------------------

class Pojo {

  int arr[] = new int[100];

  // default constructor:
  public Pojo(int arr[]) {
    this.arr = arr;
  }

  // set array element
  public void setElement(int arr[]) {
    this.arr = arr;
  }

  // get array element:
  public int[] getElement() {
    return arr;
  }
}

// ----------------------------------------------------------------------OPERATION-CLASS------------------------------------------------------------------------

class Operation {

  int arr[] = new int[100];
  int size;

  // create object of pojo class:

  // input method:
  public void ArrInput() {
    Scanner sc = new Scanner(System.in);
    boolean flag = true, flag2 = true, flag3 = true, flag4 = true;
    do {
      try {
        if (flag2) {
          System.out.println("Enter element: ");
          size = sc.nextInt();
          flag = false;
          flag2 = false;
        }

        System.out.println("Enter " + size + " element:");
        for (int i = 0; i < size; i++) {
          do {
            try {
              if (flag3) {
                arr[i] = sc.nextInt();
                // flag3 = false;
                flag4 = false;
              }
            } catch (Exception err) {
              if (err.getClass().getName().contains("InputMismatchException")) {
                System.out.println("please enter only integet value: ");
                sc.nextLine();
                flag3 = true;
                flag4 = true;
              }
            }
          } while (flag4);
        }
      } catch (Exception e) {
        if (e.getClass().getName().contains("InputMismatchException")) {
          System.out.println("please enter only integer: ");
          sc.nextLine();
          flag = true;
          flag2 = true;
        }
      }
    } while (flag);

    //   set value with the help of constructor
    Pojo objP = new Pojo(arr);
    // Output final result:
    int arrrr[] = objP.getElement();
    for (int i = 0; i < size; i++) {
      System.out.print(arrrr[i] + " ");
    }
  }
}

// ----------------------------------------------------------------------MAIN-CLASS------------------------------------------------------------------------
class DeleteArrr {

  public static void main(String[] args) {
    // method way:

    // create object of operation class:
    Operation objO = new Operation();
    objO.ArrInput();
  }
}