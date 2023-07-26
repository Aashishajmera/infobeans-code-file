import java.util.Scanner;
class TimeC{
	
	
	// Instance variable: 
	private int h, m, s;
	
	
	//constructor to set value : 
	public TimeC(int h, int m, int s){
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	
	// default constructor
	public TimeC(){
		
	}
	
	
	// add time method:
	public TimeC addTime(TimeC z){
		TimeC obj3 = new TimeC();
		obj3.h = this.h + z.h;
		obj3.m = this.m + z.m;
		obj3.s = this.s + z.s;
		
		while(obj3.m >= 60 || obj3.s >= 60){
			if(obj3.s >= 60){
			obj3.m++;
			obj3.s -= 60;
		} else if(obj3.m >= 60){
			obj3.h++;
			obj3.m -= 60;
			}
		}
		
		return obj3;
	}
	
	
	// display the final result method:
	public void display(){
		System.out.println(h +" hour " +m +" minute " +s +" second");
	}
	
	// setter method: 
	public void setH(int h){
		this.h = h;
	}
	public void setM(int m){
		this.m = m;
	}
	public void setS(int s){
		this.s = s;
	}
	
	
	// getter method: 
	public int getH(){
		return h;
	}
	public int getM(){
		return m;
	}
	public int getS(){
		return s;
	}
	
	
}

class TimeCount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//create 2 object: 
		TimeC obj1 = new TimeC(3, 33, 45);
		TimeC obj2 = new TimeC(5, 55, 56);
		
		//create 3 object:
		TimeC result = obj1.addTime(obj2);
		result.display();
	}
}