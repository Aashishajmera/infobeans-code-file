class Calculator{
	private int a , b ;
	
	public void SetData(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void add(){
		System.out.println(a+b);
	}
	
	public void sub(){
		System.out.println(a-b);
	}
	
	// value change krne ke lie
	
	public void setA(int a){
		this.a = a;
		System.out.println("SetA called: ");
	}
	
	public void setB(int b){
		this.b = 44;
	}
	
	
	// value lene ke lie

	public int getA(){
		return a;
	}
	
	public int getB(){
		return b;
	}
}


class Addition{
	public static void main(String[] args){
		
		
		// create object 
		Calculator obj = new Calculator();
		obj.SetData(33, 55);  // private data me value set: 
		obj.add();   // call add method and instance a and b value ko setData se set kiya 
		obj.sub();   // call sub method 
		obj.setA(999);   // private data ki value me instance variable a ki value change krne pr
		obj.add();   // then return call 
	}
}