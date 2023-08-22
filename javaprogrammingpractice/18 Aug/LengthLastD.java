import java.util.Scanner;

class LengthLastD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string value: ");
        String s1 = sc.nextLine();

        String s2[] = s1.split(" ");
        int count = 0;
        for(int i = 0; i < s2.length; i++){
            for(int j = 0; j < s2[i].length(); j++){
                if(i == (s2.length-1)){
                    count++;
                }
            }
        }
        System.out.println("last word digit length is: "+count);
    }
}