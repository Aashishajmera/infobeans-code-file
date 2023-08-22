class Outer{
   static class Inner{
        public static void m1(){
            System.out.println("m1 of inner class: ");
        }
    }
}

class InnerClassPra{
	public static void main(String[] args) {
        // create a object of outer class: 
        // Outer objOut = new Outer();

        // create a object of inner class: 
        // Outer.Inner objInn = objOut.new Inner();

        // call the inner class method with the help of inner class object: 
        // objInn.m1();
        // Outer.Inner.m1();

    }
}