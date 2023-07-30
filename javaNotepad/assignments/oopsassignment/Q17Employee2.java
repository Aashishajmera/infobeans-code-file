/* 17) Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
Only parameterized constructor;
totalSalary always represent total of all the salaries of all employees created.
empNo should be auto incremented.
display total employees and totalSalary using class method. */
class Employee{
	int empNo, salary, totalSalary;
	
	// defalult constructo: 
	public Employee(){
		
	}
	
	// create parameterized:
	public Employee(int empNo, int salary, int totalSalary){
		this.empNo = empNo;
		this.salary = salary;
		this.totalSalary = totalSalary;
	}
	
	// crate method: 
	public void inputSalary(){
		
	}
	
	public void display(){
		
	}
}
class Q17Employee2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees: ");
		int empNo = sc.nextInt();
		
		// employees number: 
		int arr[] = new int[empNo];
		System.out.println("first employees salary: ");
		int firstS = sc.nextInt();
	}
}