// 5) Create class OneBHK with instance variable roomArea , hallArea and price.
// Create default and parameterized constructor.
// Method show(): to print OneBHK data member information.
// 6) Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
// Create default and parameterized constructor.
// Method show(): to print all data member information.
// Write main function in another class(Say XYZ) and store three TwoBHK flat’s.information and print information using show method. Also print total amount of all flats.

import java.util.Scanner;

class OneBHK{
    private float roomArea, hallArea, price;

    // default constructor: 
    public OneBHK(){

    }

    // create constructor: 
    public OneBHK(float roomArea, float hallArea, float price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    // getData method: 
    public float getRoomArea(float roomArea){
        return roomArea;
    }
    public float getHallArea(float hallArea){
        return hallArea;
    }
    public float getPrice(float roomArea){
        return roomArea;
    }


    // show method: 
    public void show(){
        System.out.println("Room area is: "+roomArea);
        System.out.println("Hall area is: "+hallArea);
        System.out.println("Price is: "+price+" rs");
    }

}


    // Main class--------------------------------------------
class Q5OneBHK{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roomAarea: ");
        float rArea = sc.nextFloat();
        System.out.println("Entr hallArea: ");
        float hArea = sc.nextFloat();
        System.out.println("Enter price: ");
        float price = sc.nextFloat();

        // create object of OneBHK class 
        OneBHK obj = new OneBHK(rArea, hArea, price);

        // call show method: 
        obj.show();
    }
}