import java.util.Scanner;
class Pattern{
    int r; 

    // create default constructor: 
    public Pattern(int r){
        this.r = r;
    }

    public void pattern(){
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
class Q2pattern{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int r = sc.nextInt();

        // create object: 
        Pattern obj = new Pattern(r);
obj.pattern();
    }
}