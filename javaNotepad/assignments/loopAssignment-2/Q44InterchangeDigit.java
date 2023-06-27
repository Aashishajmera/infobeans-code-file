// 44) WAP to interchange first and last digit of a number

class Q44InterchangeDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int lastDigit = 0 , firstDigit = 0;
		while(n != 0){
			lastDigit = n%10;
			firstDigit = n/10;
		}
	}
}