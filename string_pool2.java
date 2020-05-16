package duanyiting;

public class string_pool2 {
    public static void main(String[] args) {
        String logo="aaa";
        String a="www.aaa.com";
        String b="www."+logo+".com";//动态拼凑,logo为变量
        System.out.println(a==b);
    }
}
