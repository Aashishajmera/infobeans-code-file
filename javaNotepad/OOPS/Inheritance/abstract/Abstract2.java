import java.util.Scanner;

abstract class A {
    private int l;
    private int w;

    // default constructor:
    public A() {
        
    }

    // parameterized constructor:
    public A(int l, int w) {
        this.l = l;
        this.w = w;
    }

    // abstract method:
    abstract public int getAre();

    // getter method for l:
    public int getL() {
        return l;
    }

    // getter method for w:
    public int getW() {
        return w;
    }
}

class B extends A {

    // default constructor:
    public B(){

    }

    // parameterized constructor:
    public B(int l, int w) {
        super(l, w);
    }

    // get area : 
    public int getAre(){
        return getL()*getW();
    }
}

class Abstract2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        B obj = new B(3,5);
       int result = obj.getAre();
       System.out.println("Area is: "+result);
    }
}