import java.util.Scanner;

class Demo{
	int k = 2;
	public void m1(){
		int a = 9;
		// System.out.println(a);
		System.out.println(k);
	}
	public void setK(Scanner sc){
		System.out.println("Enter set number of k ");
		int a = sc.nextInt();
		this.k = a;
	}
}

class Demo1{
	public void m1(){
		System.out.println("Demo1");
	}
}

class Practice{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Demo obj = new Demo();
		// Demo obj1 = obj; // obj ki properties ko apne me leleta hai
		// Demo obj1 = new Demo();
		/* obj.m1();
		obj.setK(sc);
		obj.m1();
		obj1.m1(); */
		
		/* Demo1  ojjjj = obj;
		ojjjj.m1();              esa nhi kr sakte hai because class are different*/
		
		obj.k=99;  // variable private nhi hai ishlie value change kr di 
		System.out.println(obj.k= 5); // or ese print bhi krwa sakte hai 
		
		
		// but private variable hote to method se value change krna hota without method nhi kr sakte setK method ko call krna pdta or access krne ke lie get method:
		// obj.m1();
	}
}