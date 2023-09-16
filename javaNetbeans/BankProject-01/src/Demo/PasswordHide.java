/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class PasswordHide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        char[] chars = console.readPassword();
        String s = new String(chars);
        System.out.println(s);
    }
}
