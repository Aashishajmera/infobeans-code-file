/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;
class Demo{
    static int totalSeat = 10;
    
    public static synchronized void booking(int seats){
        if(totalSeat >= seats){
            totalSeat -= seats;
            System.out.println("Seat book successfully" +totalSeat);
        }else{
            System.out.println("can't book seat: ");
        }
    }
}

class First extends Thread{
    Demo d; int seats;

    public First(Demo d, int seats) {
        this.d = d;
        this.seats = seats;
    }
    
    public void run(){
        d.booking(seats);
    }
}

class Second extends Thread{
    Demo d; int seats;

    public Second(Demo d, int seats) {
        this.d = d;
        this.seats = seats;
    }
    
    public void run(){
        d.booking(seats);
    }
}

public class Synchro2 {
    public static void main(String[] args) {
        
        Demo d = new Demo();
        
        First f = new First(d, 6);
        f.start();
            
        First f2 = new First(d, 8);
        f2.start();
        
        Demo d2 = new Demo();
        Second s = new Second(d2, 6);
        s.start();
        
        Second s2 = new Second(d2, 8);
        s2.start();
    }
}
