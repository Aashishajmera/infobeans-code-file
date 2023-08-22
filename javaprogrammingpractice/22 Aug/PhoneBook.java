// create a class phonbook having field like name, phone, address, and also containg nested class
// personal having fild like relation and method like getInput and putInput
// take all neccessary input for record 
// a) create another nested static class business having field like organisation, dept, mobile and method like accept and show 
// b) create another class containing main function that ask employee choice 
// c) if choice of user is one ask personal record else take business entry and display them

import java.lang.ref.PhantomReference;
import java.util.Scanner;

class Phonbook {
    Scanner sc = new Scanner(System.in);
    String name, phone, address;

    class Personal {
        String relation;

        public void getInput() {
            System.out.println("Enter name: ");
            name = sc.nextLine();
            System.out.println("Relation: ");
            relation = sc.nextLine();
            System.out.println("Phone number: ");
            phone = sc.nextLine();
            System.out.println("Address: ");
            address = sc.nextLine();
        }

        public void putInput() {
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
            System.out.println("Relation: "+relation);
            System.out.println("Address: " + address);
        }

    }

    class Business {
        String Organitation, mobile;
        int department_no;

        public void accept(){
            System.out.println("organitation: ");
            Organitation = sc.nextLine();
            System.out.println("Mobile number: ");
            mobile = sc.nextLine();
            System.out.println("Department number: ");
            department_no = sc.nextInt();
        }

        public void show(){
            System.out.println("Organitation: "+Organitation);
            System.out.println("Mobile: "+mobile);
            System.out.println("Department number: "+department_no);
        }
    }
}

class TestMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // create a object of phonebook class: 
        Phonbook objp = new Phonbook();

        // create object of personal class: 
        Phonbook.Personal objPrsnl = objp.new Personal();

        // create object of bussiness class: 
        Phonbook.Business objBsns = objp. new Business();

        // Enter user choice: 
        System.out.println("Enter your choice: ");
        System.out.println("press 1 - personal record:  \n press 2 - bussiness record: ");
        int choice = sc.nextInt();

        if(choice == 1){
            objPrsnl.getInput();
            objPrsnl.putInput();
        }else if(choice == 2){
            objBsns.accept();
            objBsns.show();
        }

    }
}