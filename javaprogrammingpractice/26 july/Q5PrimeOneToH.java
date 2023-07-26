class Prime{
	private int f, s;
	
	// create default constructor:
	public Prime(int f, int s){
		this.f = f;
		this.s = s;
	}
	
	// create default constructor:
	public Prime(){
		
	}
	
	// prime check method:
	public void checkPrime(){
		for(int i = f; i <= s; i++){
			boolean flag = true;
			for(int j = 2; j <= i/2; j++){
				if(i%j == 0){
					flag = false;
					break;
				}
			}
			if(flag && i > 1){
				System.out.println(i +" is prime number: ");
			}
		}
	}
}

class Q5PrimeOneToH{
	public static void main(String[] args){
		Prime obj = new Prime(1, 100);
		obj.checkPrime();
	}
}