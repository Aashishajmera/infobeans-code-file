import java.util.Scanner;

class LowerCase{
    char arr[];

    // default constructor: 
    public LowerCase(){

    }

    // create constructor:
    public LowerCase(char arr[]){
        this.arr = arr;
    }

    // lowercase 
    public char[] lowercase(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 65 && arr[i] <= 90){
                arr[i] = (char)(arr[i]+32);
            }
        }
       return arr;
    }

}
class M3LowerCase{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter string input: 
        System.out.println("Enter string input: ");
        String st = sc.nextLine();

        // convert to character type array: 
        char arr[] = st.toCharArray();
        LowerCase obj = new LowerCase(arr);

        // print array element: 
        char[] lowerCaseResult = obj.lowercase();
        for(char i: lowerCaseResult){
            System.out.print(i+" ");
        }

    }
}