package revesion;

public class RevesionIfElse {

    public static void main(String[] args) {

        for (int i = 1, j = 1; i < 10; System.out.println("One"), j++) {
            i = j - i;
        }
        
        
        for(; true;){
            System.out.println("true");
        }
        
//        for(; ;){
//            System.out.println("One");
//        }

//        for (int i = 0; i < 10; i++)
//            continue;
//            System.out.println("one time");
//        System.out.println("Two");
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 20; j++) {
//                if (1 < 10) {
//                    System.out.println("one time");
//                    if (2 < 20) {
//                        if (3 < 30) {
//                            System.out.println("Third");
//                            break;
//                        }
//                        System.out.println("second");
////                        break;
//                    }
////                    break;
//                }
////                break;
//            }
//        }
    }
}
