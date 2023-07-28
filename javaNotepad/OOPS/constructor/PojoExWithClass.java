// POJO -> Plain Old Java Object
class PojoClass{
    private int a, b;
    public PojoClass(int a, int b){
        this.a = a;
        this.b = b;
    }
	
	// default constructor
    public PojoClass(){
    }
	
	// setter method
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
	
	//getter method
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
	
}


class Addition{
	
	// without return type: 
	public void add1(PojoClass ob){
		int a = ob.getA();
		int b = ob.getB();
		System.out.println("Addition is: "+(a+b));	
	}
	
	//with return type but not object create in this method: 
	public int add2(PojoClass obj){
		int a = obj.getA();
		int b = obj.getB();
		return a+b;
	}
	
	//with return type and object create in this method: 
	public void add3(PojoClass obb){
		PojoClass ob = new PojoClass();
		int a = obb.getA();
		int b = obb.getB();
		System.out.println("Addition is: "+(a+b));
	}

}



class PojoExWithClass{
    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter 2 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        PojoClass obj = new PojoClass(a,b);  // obj-->a=20,b=10
		Addition obj1 = new Addition();
		
		// calling first method: ==> without return type: 
		System.out.println("First method result...");
		obj1.add1(obj);
		
		
		// callind second method ==> with return type but not object create in this method:
		System.out.println("Second method result...");
		int result = obj1.add2(obj);
		System.out.println("Addition is: "+result);
		
		
		// calling third method ==> with return type and object create in this method: 
		System.out.println("Third method result is...");
		obj1.add3(obj);
		
    }
}





// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// IF VARIABLE OR NOT PRIVATE: 



/* // POJO -> Plain Old Java Object
class PojoClass{
    int a, b;
    public PojoClass(int a, int b){
        this.a = a;
        this.b = b;
    }
	
	// default constructor
    public PojoClass(){
    }
	
	// setter method
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
	
	//getter method
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
	
}


class Addition{
	int a, b;
	//create defalut constructor: 
	public Addition(){
	
	} 
	
	// create constructor: 
	public Addition(PojoClass ob){
		this.a = ob.a;
		this.b = ob.b;
	}
	public void add(){
		System.out.println("Addition is: "+(a+b));
	}
}



class PojoExWithClass{
    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter 2 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        PojoClass obj = new PojoClass(a,b);// obj-->a=20,b=10
		Addition obj1 = new Addition(obj);
		obj1.add();
    }
}

*/