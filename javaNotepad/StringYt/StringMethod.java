public class StringMethod{
        public static void main(String[] args) {
            String s1 = "   Aashish";
            System.out.println(s1.length());
            System.out.println(s1.isEmpty());
            System.out.println(s1.trim());
            
            String s2 = "  ";
            System.out.println(s2.isBlank());
            System.out.println(s2.isEmpty());
        }
    
}