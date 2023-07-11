// 1. WAP sum of array element 

import java.util.Scanner;
class Q1SumElement{
	public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Enter " +n  +" element: ");
        for(int i = 0; i < x.length; i++){
            x[i] = sc.nextInt();
        }
        for(int j = 0; j < x.length; j++){
            sum += x[j];
        }
        System.out.println(sum);
    }
}