package FINAL_JS_REVESION.JAVA.Exception;

class MyExceptionClass extends Exception{
    MyExceptionClass(){
        super("age is less then 18");
    }
    
    MyExceptionClass(String msg){
        super(msg);
    }
}

public class CustomizeException {
    public static void main(String[] args) {
        int age = 12;
        try{
            if(age < 18){
            throw new MyExceptionClass();
        }else{
            System.out.println("age is greater then 18");
        }
        }catch(MyExceptionClass e){
            e.printStackTrace(); // give all the information about exception 
            // System.out.println(e);  // give the exception name
        }
    }
}
