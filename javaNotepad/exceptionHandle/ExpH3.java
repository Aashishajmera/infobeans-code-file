import java.util.Scanner;

class ExpH3{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter number: ");
      int n = sc.nextInt();
      System.out.println("Enter second number: ");
      int s = sc.nextInt();

      System.out.println("Divide is: "+(n/s));
    } catch (Exception e) {
        if(e.getClass().getName().contains("InputMismatchException")){
            System.out.println("please enter integer value: ");
        }else if(e.getClass().getName().contains("ArithmeticException")){
            System.out.println("Denominator can't be zero:");
        }
    }
  }
}
