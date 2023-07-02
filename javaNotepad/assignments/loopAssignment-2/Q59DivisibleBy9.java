// 59) WAP to find out the sum of all integer between 100 and 200 which are divisible by 9

class Q59DivisibleBy9{
	public static void main(String[] args){
		System.out.println("find out the sum of all integer between 100 and 200 which are divisible by 9");
		int f = 100, s = 200, sum = 0;
		for(int i = f; i <= s; i++){
			if(i%9 == 0){
			sum += i;
			}
		}
		System.out.println("Sum is: " +sum);
	}
}