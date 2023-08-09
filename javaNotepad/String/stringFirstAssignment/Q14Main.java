// 14) WAP check if a String contains only digits?

class Q14Main{
	public static void main(String[] args) {
        String s1 = "345k678";

        // convert character type array
        boolean flag = false;
        for(int i = 0; i< s1.length(); i++){
            if((int)s1.charAt(i) < 48 || (int)s1.charAt(i) > 57){
                flag = true; 
                break;
            }
        }
        if(flag){
            System.out.println("Not only digit: ");
        }else{
            System.out.println(" only digit: ");
        }
    }
}