public class Percentage {
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
