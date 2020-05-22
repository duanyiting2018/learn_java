package duanyiting;

public class string_replace {
    public static void main(String[] args) {
        String str="www.aaa.comwww";
        System.out.println(str.replaceAll("w","-"));
        System.out.println(str.replaceFirst("w","-"));
    }
}
