import java.util.Scanner;

class ToCharArray {
    char arr[] ;
    int index;

    // create default constructor: 
    public ToCharArray(){

    }

    // create constructor: 
    public ToCharArray(char arr[]){
        this.arr = arr;
    }
    // create method:
    public char tocharArray(Scanner sc) {
        System.out.println("Enter index : ");
        int index = sc.nextInt();
        this.index = index;
        return arr[index];
    }
}

class M4CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string value: ");
        String s = sc.nextLine();

        char arr[] = s.toCharArray();
        ToCharArray obj = new ToCharArray(arr);
        char result = obj.tocharArray(sc);
        System.out.println(obj.index +" index value is: "+ result);
        
    }
}