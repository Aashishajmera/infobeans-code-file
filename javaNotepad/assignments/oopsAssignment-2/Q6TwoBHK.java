// 5) Create class OneBHK with instance variable roomArea , hallArea and price.
// Create default and parameterized constructor.
// Method show(): to print OneBHK data member information.
// 6) Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
// Create default and parameterized constructor.
// Method show(): to print all data member information.
// Write main function in another class(Say XYZ) and store three TwoBHK flat’s.information and print information using show method. Also print total amount of all flats.

import java.util.Scanner;

class OneBHK {
    private float roomArea, hallArea, price;

    // default constructor:
    public OneBHK() {

    }

    // create constructor:
    public OneBHK(float roomArea, float hallArea, float price) {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    // getData method:
    public float getRoomArea(float roomArea) {
        return roomArea;
    }

    public float getHallArea(float hallArea) {
        return hallArea;
    }

    public float getPrice(float roomArea) {
        return roomArea;
    }

    // show method:
    public void show() {
        System.out.print("Room area is: " + roomArea + "\t Hall area is: " + hallArea + "\t Price is: " + price);
    }

}

// second class----------------
class TwoBHK extends OneBHK {
    private float twoBHKArea;
    private static float totalAmnt;

    // create default constructor:
    public TwoBHK() {

    }

    // create constructor:
    public TwoBHK(float twoBHKArea, float rArea, float hArea, float price) {
        super(rArea, hArea, price);
        this.twoBHKArea = twoBHKArea;
        totalAmnt += price;
    }

    public void show() {
        super.show();
        System.out.println("\t 2nd room area is: " + twoBHKArea);
    }

    public void totalM() {
        System.out.println("Total amount is: " + totalAmnt);
    }
}

// Main class--------------------------------------------
class Q6TwoBHK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of flat's ");
        int n = sc.nextInt();

        TwoBHK obj[] = new TwoBHK[n];

        for (int i = 0; i < obj.length; i++) {
            System.out.println("Enter "+(i+1)+" flat's details ");
            System.out.println("Enter room area: ");
            float rArea = sc.nextFloat();
            System.out.println("Enter second room area: ");
            float twoBHKArea = sc.nextFloat();
            System.out.println("Enter hall area: ");
            float hArea = sc.nextFloat();
            System.out.println("Enter price: ");
            float price = sc.nextFloat();
            obj[i] = new TwoBHK(twoBHKArea, rArea, hArea, price);
        }

        // call show method:
        for (int i = 0; i < obj.length; i++) {
            obj[i].show();
        }

        // create object:
        TwoBHK obj1 = new TwoBHK();
        obj1.totalM();
    }
}