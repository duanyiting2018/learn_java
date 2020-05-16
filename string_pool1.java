package duanyiting;

public class string_pool1 {
    public static void main(String[] args) {
        String a="www.aaa.com";
        String b="www"+".aaa"+".com";//直接赋值
        System.out.println(a==b);
    }
}
