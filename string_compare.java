package duanyiting;

public class string_compare {
    public static void main(String[] args) {
        String str1="duanyiting";
        String str2="DuanyitinG";
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println("Hello".compareTo("Hello"));
        System.out.println(str1.compareToIgnoreCase(str2));
    }
}
