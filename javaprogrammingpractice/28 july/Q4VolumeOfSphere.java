import java.util.Scanner;
class VolumeOfSphere{
	int r ;
	// create default constructor: 
	public VolumeOfSphere(){
		
	}
	
	//create input radius constructor:
	public VolumeOfSphere(int r){
		this.r = r;
	}
	
	// calculafte volumeOfSphere:
	public void calculateSphere(){
		double calOfSphere = (4/3)*(3.14)*(r*r*r);
		System.out.println("VolumeOfSphere is: " +calOfSphere);
	}
}
class Q4VolumeOfSphere{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r = sc.nextInt();
		VolumeOfSphere obj = new VolumeOfSphere(r);
		obj.calculateSphere();
	}
}