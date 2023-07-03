//16)
// a 
// bc 
// def 
// ghij 
// klmno 

class pt16{
	public static void main(String[] args){
		char p = 97;
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= r; c++){
				System.out.print(p);
				p++;
			}
			System.out.println();
		}
	}
}