// lamda expression: 

import java.util.Scanner;

interface First {
  void m1();
}

interface Second {
  void m2(int x, int y);
}

class TestInterface1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int num1 = sc.nextInt();
    System.out.println("Enter second number: ");
    int num2 = sc.nextInt();

    // lamda expression:
    Second objS = (n1, n2) -> {
      System.out.println("Addition is: " + (n1 + n2));
    };

     Second objS2 = (n1, n2)->{
        System.out.println("Multiply is: "+(n1-n2));
    };

   Second objS3 = (n1, n2)->{
        if(n1 > n2)
            System.out.println("greater than: "+n1);
        System.out.println("greater than: "+n2);

    };
    // class three method: 
    objS.m2(num1, num2);
    objS2.m2(num1, num2);
    objS3.m2(num1, num2);
  }
}
