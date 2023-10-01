/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;

class Test {

    public void m1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class Synchro1 extends Thread {

    static Test t;

    public void run() {
        t.m1();
    }
    public static void main(String[] args) {
        t = new Test();
        Synchro1 s1 = new Synchro1();
        s1.start();

        Synchro1 s2 = new Synchro1();
        s2.start();
    }
}
