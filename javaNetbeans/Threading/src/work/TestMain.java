/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;

import com.sun.source.tree.Scope;

class A {

    synchronized public void m1(B obj) {
        System.out.println("This is m1 of class A");
        obj.p2();
    }

    synchronized public void m2() {
        System.out.println("this is m2 of class A" + Thread.currentThread().getName());
    }

}

class B {

    synchronized public void p1(A obj1) {
        System.out.println("This is p1 of class B");
        obj1.m2();
    }

    synchronized public void p2() {
        System.out.println("this is p2 of class B" + Thread.currentThread().getName());

    }

}

class First extends Thread {

    A obj;
    B obj1;

    public First(A obj, B obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }

    public void run() {
        obj.m1(obj1);
    }

}

class Second extends Thread {

    A obj;
    B obj1;

    public Second(A obj, B obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }

    public void run() {
        obj1.p1(obj);
    }
}

public class TestMain {

    // create object of class A 
    A obj = new A();
    // create object of class B
    B obj1 = new B();

    // create a thread a first thread and second thread
   First t1 = new First(obj , obj1 ) ;
   Second t2 = new Second (obj ,obj1) ; 
   t1.start() ;
//    f1.sta
    
   
}
