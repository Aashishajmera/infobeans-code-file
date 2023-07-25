import java.util.Scanner;

class A {

	// method sum me hi input lene pr: ==> method-1
	// create method
	public void sum(Scanner sc) {
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();

		// create array:
		int arr[] = new int[size];
		System.out.println("Enter " + size + " element: ");

		// input array element:
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// print array element:
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// method me bina kuchh pass krne pr ==> method-2
	// create method
	public void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();

		// create array:
		int arr[] = new int[size];
		System.out.println("Enter " + size + " element: ");

		// input array element:
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// print array element:
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

// new class:
class B {
	private int x[] = { 34, 67, 8, 99 };

	public void printt() {
		// print array element:
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

	public void setArr(Scanner sc) {
		System.out.println("Enter 4 element: ");
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
	}
}


class C{
	 int x = 9;
	public void m1(){
		System.out.println(x);
	}
}

public class Practice {
	public static void main(String[] args) {

		/*
		 * //first method calling:
		 * Scanner sc = new Scanner(System.in);
		 * A obj1 = new A();
		 * obj1.sum(sc);
		 */

		/*
		 * Second method calling:
		 * A obj2 = new A();
		 * obj2.sum(sc);
		 */

		/*
		 * // Second class ki first method calling:
		 * Scanner sc = new Scanner(System.in);
		 * // second class ke lie object create
		 * B obj1 = new B();
		 * obj1.printt();
		 * obj1.setArr(sc);
		 * System.out.println("set array element is: ");
		 * obj1.printt();
		 */



		 // third class ka object :
		 C obj = new C();
		 obj.x = 99;
		 obj.m1();

	}
}