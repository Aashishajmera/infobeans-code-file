class Test{
  public void Test(){
    System.out.println("Executed....");
  }
}
class FourthEx{
    public static void main(String args[]){
        //new Test().Test();
        Test obj = new Test();
        obj.Test();
    }
}