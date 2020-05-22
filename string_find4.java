package duanyiting;

public class string_find4 {
    public static void main(String[] args) {
        String str="**@@www.aaa.cn##";
        System.out.println(str.startsWith("*"));
        System.out.println(str.startsWith("@@"));
        System.out.println(str.startsWith("@@",2));
        System.out.println(str.endsWith("##"));
    }
}
