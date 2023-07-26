// Q3) Write a program to find sum of all integer grater than 100 and and less than 200 there are divisible by 7

class GraterThan{
	public void graterThan(int f , int s){
		int sum = 0;
		for(int i = f; i < s; i++){
			if(i%7 == 0){
				sum += i;
			}
		}
		System.out.println("Total sum is: "+sum);
	}
}
class Q3DivisibleBy7{
	public static void main(String[] args){
		int first = 101 , second = 200;
		GraterThan obj = new GraterThan();
		obj.graterThan(first, second);
	}
}