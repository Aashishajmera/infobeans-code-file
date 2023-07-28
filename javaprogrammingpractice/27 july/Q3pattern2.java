class Pt{
	private int a ;
	
	// default constructor: 
	public Pt(){
		
	}
	
	//create constructor:
	public Pt(int a){
		this.a = a;
	}
	
	public void pt(){
		for(int i = 1; i <= a; i++){
			for(int j = 1; j <= i; j++){
				if(j == i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

class Q3pattern2{
	public static void main(String[] args){
		Pt obj = new Pt(5);
		obj.pt();
	}
}