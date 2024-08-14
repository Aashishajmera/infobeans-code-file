public class Perfect {
    public static void main(String[] args) {
        int n = 6, perfect = 0;
      for(int i = 1; i <= n/2; i++){
          if(n % i == 0){
              perfect += i;
          }
      }
      
      if(perfect == n){
          System.out.println("Number is perfect: ");
      }else{
          System.out.println("Number is not perfect: ");
      }
    }
}
