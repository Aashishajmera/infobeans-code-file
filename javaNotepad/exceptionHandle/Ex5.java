class Test{
    public void m1(){
      try{ 
        /*---- */
        //throw new Exception();
        //throw new Error();
        throw new Throwable();
      }
      catch(Throwable e){
        System.out.println("Catch executed...");
      }
      finally{
         System.out.println("Finally Executed...");
      } 
    }
}

class Ex5{
    public static void main(String args[]){
        new Test().m1();
    }
} 