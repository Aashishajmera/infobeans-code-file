// 8) Create a class Student with two members : rollno and percentage.
// 	Create default and parameterized constructors. Create method show() to 	display information.
// 	Create another class CollegeStudent inherits Student class. Add a new membersemester to it.
// 	Create default and parameterized constructors. Also override show() method.
// 	Create another class SchoolStudent inherits Student class.
// 	Add a new memberclassname(eg 12 th ,10 th etc.) to it. Create default and parameterized 	
// 	constructors. Also override show() method.
// 	Create a class(say XYZ) with main method that carries out the operation of the project :
// has array to store objects of any class(Student or CollegeStudent, SchoolStudent).
// create two CollegeStudent and three SchoolStudent record objects and store 	them inside the array.
// display all record from the array.
// search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
// count how many students are having A grade,if for A grade percentage >75.

// STUDENT - CLASS ---------------------------------------------

import java.util.Scanner;

class Student {
	protected int rollno;
	protected float percentage;

	// private int rollno;
	// private float percentage;

	// default constructor:
	public Student() {

	}

	// parameterized constructor:
	public Student(int rollno, float percentage) {
		this.rollno = rollno;
		this.percentage = percentage;
	}

	// getter method of rollnumber:
	public int getRollnum() {
		return rollno;
	}

	// getter method of percentage:
	public float getPercentage() {
		return percentage;
	}

	// show method:
	public void show() {
		System.out.println("roll number: \t" + rollno);
		System.out.println("Percentage: \t" + percentage);
	}

	// check roll Number method: 
	public void check(int check, Student objS[], int cS ) {
		boolean flag = true;kkkioZ
		for (int i = 0; i < objS.length; i++) {
			if (i < cS) {
				if (check == objS[i].rollno) {
					System.out.println("This roll number is college student: ");
					flag = false;
					break;
				}
			} else {
				if (check == objS[i].rollno && flag) {
					System.out.println("This roll number is school student: ");
					break;
				}
			}
		}
	}

	// grade check
	public void grade(Student objS[]){
		int count = 0; 
		for(int i = 0; i < objS.length; i++){
			if(objS[i].percentage > 75){
				count++;
			}
		}
		System.out.println(count +" student A grade: ");
	}

}

// COLLEGE - STUDENT -----------------------------------------------------
class CollegeStudent extends Student {
	private int semester;

	// default constructor:
	public CollegeStudent() {

	}

	// parameterized constructor:
	public CollegeStudent(int rollno, float percentage, int semester) {
		super(rollno, percentage);
		this.semester = semester;
	}

	// show method:
	public void show() {
		System.out.println("show college student information: ");
		super.show();
		System.out.println("Semester: \t" + semester);
	}
}

// SCHOOL - STUDEND -----------------------------------------------------
class SchoolStudent extends Student {
	private int classes;

	// default constructor:
	public SchoolStudent() {

	}

	// parameterized constructor:
	public SchoolStudent(int rollno, float percentage, int classes) {
		super(rollno, percentage);
		this.classes = classes;
	}

	// show method:
	public void show() {
		System.out.println("show school student information: ");
		super.show();
		System.out.println("class: \t" + classes);
	}

}

// MAIN - CLASS ------------------------------------------------------
class Q8StudentMain {
	public static void main(String[] args) {

		int rollno, semester;
		float percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of college student: ");
		int cS = sc.nextInt();
		System.out.println("Enter number of school student: ");
		int sS = sc.nextInt();
		int n = 1;

		// create object type array of class student:
		Student objS[] = new Student[cS + sS];
		// create object type array of student class: 		

		for (int i = 0; i < objS.length; i++) {

			// college student details:
			if (i < cS) {
				System.out.println((i + 1) + " college student details: ");
				System.out.println("Enter rollnumber: ");
				rollno = sc.nextInt();
				System.out.println("Enter percentage: ");
				percentage = sc.nextFloat();
				System.out.println("Enter semester: ");
				semester = sc.nextInt();
				objS[i] = new CollegeStudent(rollno, percentage, semester);
			}

			// school student details:
			else {
				System.out.println((n) + " school student details: ");
				System.out.println("Enter rollnumber: ");
				rollno = sc.nextInt();
				System.out.println("Enter percentage: ");
				percentage = sc.nextFloat();
				System.out.println("Enter classes: ");
				semester = sc.nextInt();
				objS[i] = new SchoolStudent(rollno, percentage, sS);
				n++;
			}
		}

		// print student details:
		for (int i = 0; i < objS.length; i++) {

			// college student details print:
			if (i < cS) {
				objS[i].show();
				System.out.println();
			}

			// school student details print:
			else {
				objS[i].show();
				System.out.println();
			}
		}

		// check roll number:
		System.out.println("Etner check rollnumber: ");
		int checkN = sc.nextInt();

		// // call check method:
		// objS.checkRollNum(check);

		// check rollNumber method:
		Student objS2 = new Student();
		objS2.check(checkN, objS, cS);

		// check A grade student: 
		objS2.grade(objS);
	}
}