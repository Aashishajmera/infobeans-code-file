import java.util.Scanner;
class CheckNum{
	public void checkNum(int a, int b, int c){
		if(a > 20){
			System.out.println(a+" is greater than 20 ");
		}else if(a == 20){
			System.out.println(a +" is equal 20 ");
		}
		if( b > 20){
			System.out.println(b+" is greater than 20");
		} else if(b == 20){
			System.out.println(b + " is equal 20 ");
		}
			 if(c > 20){
			System.out.println(c+" is greater than 20");
		}else if(c == 20){
			System.out.println(c +" is equal: ");
		}else{
			System.out.println("Enter number are lessthan 20");
		}
	}
}

class Q1CheckNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		System.out.println("Enter second number: ");
		int second = sc.nextInt();
		System.out.println("Enter third number: ");
		int third = sc.nextInt();
		
		CheckNum obj = new CheckNum();
		obj.checkNum(first,second,third);
	}
}