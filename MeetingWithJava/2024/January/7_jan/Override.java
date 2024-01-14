class Base{
    // public void m1(){
    //     System.out.println("I am parent....");
    // }

    protected Base(){
        
    }

}
public class Override extends Base {

    public void m1(){
        System.out.println("I am child");
    }

    public static void main(String[] args) {
        
    }
}
