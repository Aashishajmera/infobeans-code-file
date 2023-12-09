// public class Demo {
//   static {
//     System.out.println("I am static block: ");
//   }
// }


// EVERY CLASS HAVE A MAIN MEHTOD AND ONLY ONE FILE (yes we can do it)
// class InnerDemo {
//     public static void main(String[] args) {
//         System.out.println("This is a innerDemo class");
//     }
// }


// public class Demo {
//     public static void main(String[] args) {
//         System.out.println("This is main method: ");
//     }
// }



public class Demo {
  static {
    System.out.println("class without a main method");
    System.exit(0);
  }
}
