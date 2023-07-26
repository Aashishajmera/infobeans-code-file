class Prime2{
	private long f, s;
	
	// create constructor:
	public Prime2(long f, long s){
		this.f = f;
		this.s = s;
	}
	
	// create default constructor:
	public Prime2(){
		
	}
	
	
	public void checkPrime(){
		
		for(long i = f; i <= s; i++){
			long mul = 1;
			for(long j = i; j != 1; j--){
				mul *= j;
			}
			System.out.println(i+" factorial is: "+mul);
		}
	}
}

class Q5PrimeBetween{
	public static void main(String[] args){
		// create object
		Prime2 obj = new Prime2(1, 100);
		obj.checkPrime();
	}
}