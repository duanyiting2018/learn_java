package duanyiting;

public class regular_expression {
    public static void main(String[] args) {
        String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";//正则表达式
        String s1="144005ac@838564yuah.aac.com";
        String s2="abchehgiru@.cn";
        String s3="afiurh93578@ah5629bn.565.cn";
        if(s1.matches(regex))
        {
            System.out.println(s1+"是一个合法e-mail地址");
        }
        if(s2.matches(regex))
        {
            System.out.println(s2+"是一个合法e-mail地址");
        }
        if(s3.matches(regex))
        {
            System.out.println(s3+"是一个合法e-mail地址");
        }
    }
}
