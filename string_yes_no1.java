package duanyiting;

public class string_yes_no1 {
    public static void main(String[] args) {
        String a="duanyiting";
        String b=new String("duanyiting");
        String c=b;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
    }
}
