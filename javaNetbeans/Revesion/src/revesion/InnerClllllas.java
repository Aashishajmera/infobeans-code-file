
package revesion;

class Outer {

    class Inner {

        public void m1() {
            System.out.println("This is m1 of inner class");
        }
        
    }

    public void m2() {
        System.out.println("This is m2 of outer class: ");
//        Inner i = new Inner();
//        i.m1();

    }
}

public class InnerClllllas {
    public static void main(String[] args) {
        // create a object of outer class: 
//        Outer o = new Outer();
//        o.m2();

    // create a anonymous inner class of outer class: 
    
//    Outer objo = new Outer(){
//        
//    };
//    objo.m2();

    Outer objO = new Outer();
//    Outer.Inner objI = objO.new Inner();
    Outer.Inner objI = new Outer().new Inner();

    objI.m1();


    }
}
