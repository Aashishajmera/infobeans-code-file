// 61) WAP to find out all the leap years between two entered years

import java.util.Scanner;
class Q61LeapTwoYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any first year: ");
		int y1 = sc.nextInt();
		System.out.println("Enter last year: ");
		int y2 = sc.nextInt();
		
		if(y1 <= y2){
			for(int i = y1; i <= y2; i++){
			if((i%4==0 && i%100 != 0) || (i%400 == 0 )){
				System.out.println(i +" is a leap year: ");
				}
			}
		}else{
			for(int i = y2; i <= y1; i++){
			if((i%4==0 && i%100 != 0) || (i%400 == 0 )){
				System.out.println(i +" is a leap year: ");
				}
			}
		}
	}
}