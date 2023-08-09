// 30. Write a Java program How to search a word inside a string?

import java.util.Scanner;
class Search{
    public void searchValue(String arr[], String search){
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(search)){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Found: ");
        }else{
            System.out.println("Not found: ");
        }
    }
}
class Q30Search{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter search element: ");
        String search = sc.nextLine();

        // split 
        String arr[] = s1.split(" ");

        // create object: 
        Search obj = new Search();
        obj.searchValue(arr, search);

    }
}