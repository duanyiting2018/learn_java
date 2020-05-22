package duanyiting;

public class string_find2 {
    public static void main(String[] args) {
        String str="www.aaa.cn";
        System.out.println(str.indexOf("aaa"));//返回起始索引
        System.out.println(str.indexOf("hello"));//没有查找到返回-1
        System.out.println(str.indexOf(""));//返回索引0
        if(str.indexOf("aaa")!=-1)
        {
            System.out.println("要查询的字符串存在。");
        }
    }
}
