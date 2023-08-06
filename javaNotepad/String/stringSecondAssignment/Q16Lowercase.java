// 16. Write a Java program to convert all the characters in a string to Lowercase
class LowerCase{
    public char[] lowercase(char arr[]){
         for(int i = 0; i < arr.length; i++){
            if(65 <= arr[i] && arr[i] <= 90){
                arr[i] = (char)(arr[i]+32);
            }
        }
        return arr;
    }
}
class Q16Lowercase{
	public static void main(String[] args) {
        String s1 = "AaShiSH";

        char arr[] = s1.toCharArray();
       
        // create object: 
        LowerCase obj = new LowerCase();
        
        // call method: 
       char lowercase[] = obj.lowercase(arr);

        for(int i = 0; i < lowercase.length; i++){
            System.out.print(lowercase[i]);
        }
    }
}