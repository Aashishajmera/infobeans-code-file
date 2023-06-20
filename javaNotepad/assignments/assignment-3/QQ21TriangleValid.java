// 21. Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 

import java.util.Scanner;

public class QQ21TriangleValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st angle: ");
        int angle1 = sc.nextInt();
        System.out.println("Enter 2nd angle: ");
        int angle2 = sc.nextInt();
        System.out.println("Enter 3rd angle: ");
        int angle3 = sc.nextInt();

        int triangle = (angle1 + angle2 + angle3);
        if(triangle == 180){
            System.out.println("The triangle is valid: ");
        }else{
            System.out.println("the triangle is not valid: ");
        }
    }
}
