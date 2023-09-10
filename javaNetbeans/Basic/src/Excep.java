
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hp
 */
public class Excep extends Object {

    int m1() {
        try {
            System.out.println("Enter number: ");
//            int n = sc.nextInt();
            
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    public static void main(String[] args) {
        try {

        } finally {
            System.out.println("Ajmera");
//            return 44;
        }
    }
}
