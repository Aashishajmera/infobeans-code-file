import java.util.Scanner;

class Test {
	public void bonus(int x){
		if(x >= 10000){
			System.out.println("Eligible for bonus as 20%: ");
			int bonus = (x * 20)/100;
			int total = (x+bonus);
			System.out.println("Bonus is: "+bonus);
			System.out.println("Total amount is: "+total);
		}else{
			System.out.println("Not eligible for bonus: ");
		}
	}
}

class Q2SalesOfPerson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount: ");
		int amount = sc.nextInt();

		// create object:
		Test obj = new Test();
		obj.bonus(amount);

	}
}