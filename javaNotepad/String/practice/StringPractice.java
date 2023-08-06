public class StringPractice{
	public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "Abc";
        System.out.println(s1 == s2);

        String s3 = s1;
        System.out.println(s3 == s1);

        String s4 = new String("abc");
        System.out.println(s1 == s4);

        String s5 = "xyz";
        System.out.println(s1 == s5);

        String s6 = new String("xyz");
        System.out.println(s5 == s6);

        String s7 = s1 + s5;
        String s8 = "abc"+"xyz";
        System.out.println(s7 == s8);

        String s9 = s1 + "xyz";
        System.out.println(s8 == s9);

        String s10 = "yt";
        String s11 = new String("yt");
        System.out.println(s10 == s11);


    }
}