// 4)How to update and retrive  the value of a particular property of an object from anothor class(Let suppose the property is private) ?

import java.util.Scanner;

class Update{
    private int value;

    public  Update(int value){
        this.value = value;
    }

    // setter method:
    public void setValue(int value) {
        this.value = value;
    }

    // getter method:
    public int getValue(){
        return value;
    }
}
public class Q4UpdateValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create object 
        Update obj = new Update(11);

		// default value 
		// get value;
		
		System.out.println("default value is: "+(obj.getValue()));
		
        // change the value of a particular variable: 
        System.out.println("Enter change value: ");
        int value = sc.nextInt();
        obj.setValue(value);

        // change value :
        int result = obj.getValue();
		System.out.println("change value is: "+result);


    }
}
