// 5. Write a proram to input the marks of 5 subject of student. then calculate the percentage. if percentage is greater then 60 print you are passed with 1st divistion , if percetnage is between 50 to 59 then print 2nd division, if percentage is between 33 to 49 then print 3rd division otherwise failed. You have print the marksheet with proper formate with total marks obtained and division.

public class Q5Percentage {
    public static void main(String[] args) {
        byte Maths = 90;
        byte Computer = 67;
        byte Physics = 55;
        byte Hindi = 88;
        byte English = 72;

        int percentage = (Maths+ Computer + Physics + Hindi + English) / 5 ;
        if(percentage >= 60){
            System.out.println("you are passed with 1st divistion " +percentage+"%");
        }else if(percentage >= 50 && percentage < 60){
            System.out.println("you are passed with 2nd divistion " +percentage+"%");
        }else if(percentage >= 33 && percentage < 50){
            System.out.println("you are passed with 3rd divistion " +percentage+"%");
        }else{
            System.out.println("failed" +percentage+"%");
        }
    }
}
