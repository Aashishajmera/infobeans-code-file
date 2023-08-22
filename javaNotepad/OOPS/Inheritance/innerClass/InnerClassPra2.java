class Outer{

    // 1st inner class: 
    class Inner{
        public static void m1(){
            System.out.println("m1 of inner class: ");
        }
    }

    // 2nd inner class: 
    class sInner{
        public static void m1(){
            System.out.println("m1 of second inner class: ");
        }
    }

    // outer class method: 
    public void m2(){
        System.out.println("m2 of outer class: ");
    }
}

class InnerClassPra2{
	public static void main(String[] args) {
        // create a object of outer class: 
        Outer objOut = new Outer();

        // create a object of inner class: 
        Outer.Inner objInn = objOut.new Inner();

        // call the inner class method with the help of inner class object: 
        // objInn.m1();
        // Outer.sInner.m1();
        // Outer.Inner.m1();
        // objOut.m2();
        objInn.m2();
    }
}