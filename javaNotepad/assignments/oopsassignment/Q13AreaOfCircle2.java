/* 13) Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
init - to input radius from user
calc - to calculate area
display- to display area */

import java.util.Scanner;
class AreaOfCircle{
	private float radius, area;
	
	// create method:
	public void calculate(float radius){
		area = (3.14f) * radius * radius;
	}
	
	// create display:
	public void display(){
		System.out.println("Area of circle is: "+area);
	}
}

class Q13AreaOfCircle2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		float r = sc.nextInt();
		
		AreaOfCircle obj = new AreaOfCircle();
		obj.calculate(r);
		obj.display();
	}
}