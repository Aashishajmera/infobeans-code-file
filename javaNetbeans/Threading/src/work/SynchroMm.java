package work;

public class SynchroMm {
    static int n = 1;
     public static void m1(){
        if(n>=1){
            n = n - 1;
            System.out.println("run "+n);
        }else{
            System.out.println("sorry");
        }
    }
    
    public static void main(String[] args) {
        SynchroMm.m1();
        SynchroMm.m1();
    }
}
