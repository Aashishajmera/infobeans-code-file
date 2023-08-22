class Demo {
    // final method:
    final public static void m1() {
        System.out.println("this is a final method: ");
    }
}

class Final1 extends Demo {

   final public static void m1(){
        System.out.println("change m1: ");
    }

    public static void main(String[] args) {

        // final variable:

        // final int a = 12;
        // System.out.println(a);
        // a = 22;
        // System.out.println(a);

        // create object of Demo class:
        Demo objD = new Demo();

        // check final method:
        objD.m1();
        // this.m1();

        // override m1 final method:
        
       
    }
}