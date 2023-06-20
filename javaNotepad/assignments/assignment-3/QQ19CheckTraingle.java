// 19. W.A.P to check whether the traingle is equilateral, scalene, or isosceles. 
// Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides
//  of equal length. Equilateral triangle: In geometry, an equilateral triangle is a 
// triangle in which all three sides are equal. Scalene triangle: 
// A scalene triangle is a triangle that has three unequal sides. 

import java.util.Scanner;

public class QQ19CheckTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side: ");
        int fSide = sc.nextInt();
        System.out.println("Enter second side: ");
        int sSide = sc.nextInt();
        System.out.println("Enter third side: ");
        int tSide = sc.nextInt();

        // Isosceles triangle
        if ((fSide == sSide && fSide != tSide) || (fSide == tSide && fSide != sSide)
                || (sSide == tSide && sSide != fSide)) {
            System.out.println("Traiangle is Isosceles traiangle: ");
        }
        // Equilateral traiangle
        else if (fSide == sSide && sSide == tSide) {
            System.out.println("Traiangle is Equilateral traiangle: ");
        }
        // scalene traiangle
        else {
            System.out.println("Traiangle is scalene traiangle: ");

        }
    }
}
