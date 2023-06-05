public class SubAb3 {
    public static void main(String[] args) {
        byte a = 6;
		byte b = 3;
		int c = (a*a*a) - (b*b*b) - (3*a*a*b) + (3*a*b*b);
		System.out.println("(a-b)^3 value is: " +c);
    }
}
