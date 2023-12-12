// // import java.io.Console;

// // public class ConsoleExample {
// //     public static void main(String[] args) {
// //         Console console = System.console();
// //         String name = console.readPassword();
// //         System.out.println("Hello, " + name + "!");
// //     }
// // }


// class ConsoleExample {

//   private ConsoleExample() {}

//   public static ConsoleExample ConReturn() {
//     return new ConsoleExample();
//   }

// }

// class Sohan {

//   public static void main(String[] args) {
//     System.out.println("hello");

//     ConsoleExample clg = ConsoleExample.ConReturn();
//     ConsoleExample clg2 = ConsoleExample.ConReturn();

//     System.out.println(clg);
//     System.out.println(clg2);
//   }
// }


/**
 * ConsoleExample
 */
public class ConsoleExample {

    protected ConsoleExample(){

    }

     public static void main(String[] args) {
        ConsoleExample clg  = new ConsoleExample();
        
     }
}