import java.util.Scanner;

class CheckMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // check length methods:
        System.out.println("Enter strign value: ");
        String s1 = new String(sc.nextLine());
        System.out.println("length is: " + s1.length()); // length of the string value :

        // // print UpperCase:
        // System.out.println("UpperCase:   " + s1.toUpperCase()); // convert to the uppercase

        // // print lowercase:
        // System.out.println("Lowercase:   " + s1.toLowerCase()); // convert to lowercase:

        // // char At
        // char arr[] = s1.toCharArray();
        // int i = 0;
        // System.out.println("Enter char index: only " + i + " to " + (arr.length - 1));
        // int index = sc.nextInt();
        // System.out.println(index + " index value is:  " + s1.charAt(index));

        // // index of char
        // System.out.print("Enter character:  (only find first character:)");
        // char chtr = sc.next().charAt(0);
        // sc.nextLine();
        // System.out.print("character is:  ");
        // int x = s1.indexOf(chtr);
        // if (x == -1) {
        //     System.out.println("not found: ");
        // } else {
        //     System.out.println(x);
        // }

        // // last index of char
        // System.out.print("Enter character:  (only find first character:)");
        // char chtr1 = sc.next().charAt(0);
        // sc.nextLine();
        // System.out.print("character is:  ");
        // int x1 = s1.indexOf(chtr1);
        // if (x1 == -1) {
        //     System.out.println("not found: ");
        // } else {
        //     System.out.println(x1);
        // }

        // // contains method check the value:
        // System.out.println("check the contains of first enter input: ");
        // String st = sc.nextLine();
        // System.out.println("Contains true/false : " + s1.contains(st));

        // last index of: 
        // System.out.println("last index of: (any present letter:)");
        // System.out.println("Enter any letter of present string : ");

        // System.out.println(s1.lastIndexOf('s'));


        // trim method: remove starting space: 
        // System.out.println("Trim method: ");
        // System.out.println(s1.trim());

        // check the word and character peresent or not: 
        // System.out.println("Enter any character or word: ");
        // String s = sc.nextLine();
        // System.out.println(s1.contains(s));
        
        
        // split method: ++++++
        System.out.println("split method: ");
        // String s2[] = s1.split(" ");
        String s2[] = s1.split("a");
        System.out.println(s2);

        
        // sub string : 
        // System.out.println("sub string ");
        // System.out.println(s1.substring(sc.nextInt()));


        // substring of: 
        System.out.println("sub string enter first and last index of substring : ");
        System.out.println(s1.substring(sc.nextInt(), sc.nextInt()));


        // compare to : +++++
        // System.out.println("Compare to method: ");
        // System.out.println("Enter second string: ");
        // String s2 = sc.nextLine();
        // System.out.println(s1.compareTo(s2));


        // equal method:  
        // System.out.println("Equal method: ");
        // System.out.println(s1.equals("Aashish"));


        // ignore case: 
        // System.out.println("Ignore case: ");
        // System.out.println(s1.equalsIgnoreCase("Aashish"));
    }
}