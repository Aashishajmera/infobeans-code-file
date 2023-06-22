// 23. WAP to print all armstrong number from 101 to 999

public class Q23Armstron101To199 {
    public static void main(String[] args) {
        int lastDigit = 0,arm=0;
        for(int i = 101; i<=199; i++){
            for(int j = i; j!= 0; j/=10){
                lastDigit = j%10;
                arm += lastDigit*lastDigit*lastDigit;
            }if(i == arm){
                System.out.println(arm +" is armstron number: ");
            }
            arm = 0;
        }
    }
}