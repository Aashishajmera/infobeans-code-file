public class StringPrtc {

    public static void main(String[] args) {
        
//        StringBuffer objB = new StringBuffer("Raja ji");
//        StringBuffer objC = new StringBuffer("Raja ji");
//        System.out.println(objB.compareTo("Raja"));
        
        String s1 = "   Aashish";
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.trim());

        String s2 = "";
        System.out.println(s2.isBlank());
        System.out.println(s2.isEmpty());

        String s3 = "aashish";
        String s4 = "Aashish";
        System.out.println(s1 == s3);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));

        String s5 = "A";
        String s6 = "a";
        System.out.println(s5.compareTo(s6));
        System.out.println(s5.compareToIgnoreCase(s6));

        String s7 = "asdfszdad";
        String s8 = "Ckjiic";
        System.out.println(s7.compareTo(s8));

        String s9 = "";
        System.out.println(s3.compareTo(s9));

        System.out.println(s1 + s4);
        System.out.println(s1 + 10 + s4);
        System.out.println(100 + s1);

        String a1 = "Raj";
        String a2 = "a";

        System.out.println(String.join(" ;", a1, a2, s1));
//        System.out.println(String.join(null, a1,a2));

        System.out.println(a1.join(" ", s1, s2));
        System.out.println(a1.join("--", a1, a2));

        String a3 = "Aashish-ajmera";
        System.out.println(a3.subSequence(2, 7));
        System.out.println(a3.substring(4));
        System.out.println(a3.substring(4,9));
        
        System.out.println(a3.replace("sh", "raj"));
        System.out.println(a3.replace("s", "kkk"));
        System.out.println("--------------");
        System.out.println(a3.replace("kamla", a3));
        
        System.out.println(a3);
        
        System.out.println(a3.replaceAll(a3, a3));
        System.out.println(a3.replaceAll("sh(.)", "Hiiii"));
        System.out.println(a3.replaceAll("sh(.*)", "I AM"));
        
        System.out.println(a3.indexOf("shi"));
        
        
        String s11 = new String("Raja");
        System.out.println(s11.startsWith("rh"));
         
        
    }
}
