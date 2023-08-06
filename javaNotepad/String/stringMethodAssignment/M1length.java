import java.util.Scanner;

class Length {
    String st;
    char arr[];

    // String input method:
    public void input(Scanner sc) {
        System.out.println("Enter string value: ");
        String st = sc.nextLine();
        this.st = st;
    }

    // convert string value to character array: 
    public void charArr(){
        char arr[] = st.toCharArray();
        this.arr = arr;
    }

    // Length method 
    public int length() {
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            counter++;
        }
        return counter;
    }
}

class M1length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // create object: 
        Length obj = new Length();
        obj.input(sc);
        obj.charArr();
        int resultLength  = obj.length();
        System.out.println("Enter string value length is: "+resultLength);
    }
}