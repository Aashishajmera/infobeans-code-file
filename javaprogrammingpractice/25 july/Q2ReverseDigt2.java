class Reverse{
	public void reverse(int n){
		int rem = 0, reverse = 0;
		while(n != 0){
			rem = n % 10;
			reverse = (reverse*10)+rem;
			n = n/10;
		}
		System.out.println("Reverse number is: "+reverse);
	}
}

class Q2ReverseDigt2{
	public static void main(String[] agrs){
		Reverse obj = new Reverse();
		obj.reverse(123);
	}
}