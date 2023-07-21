import java.util.Scanner;

class mthd{
	
	/*public void m1(){
		System.out.println("m1 called: ");
		m3();
	}
	
	public void m2(){
		System.out.println("m2 called: ");
	}
	
	public void m3(){
		System.out.println("m3 called: ");
		m2();
	}
	
	
	
	// Method for array: 
	
	public int[] arrM(int arr[]){
		System.out.println("Enter array element is: ");
		
		return arr;
	}*/
	
	
	
	
	// method access A and B 
	
	public void a(){
		System.out.println("a method: ");
	}
	
}


// second class
class mthd2{
		public void b(mthd obj){
			System.out.println("b method: ");
			obj.a();
		}
	}


class methodInOneCode{
	public static void main(String[] args){
		
	/* 	//array 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter " +size +" element: ");
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		mthd obj = new mthd();
		
		
		// obj.m1();
		int x[] = obj.arrM(arr);
		
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i]);
		} */
		
		
		
		//object 
		mthd2 obj = new mthd2();
		mthd obj1 = new mthd();
		
		obj.b(obj1);
		
		
	}
}