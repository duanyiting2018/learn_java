package duanyiting;

class Chinese2
{
    private String name;
    private int age;
    private static String country="中华人民共和国";
    public Chinese2(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public static void setCountry(String c)
    {
        country=c;
    }
    public String getInfo()
    {
        return "姓名："+this.name+" 年龄："+this.age+" 国家："+Chinese2.country;
    }
}
public class class_k {
    public static void main(String[] args) {
        Chinese2.setCountry("中国");
        Chinese2 per=new Chinese2("张三",10);
        System.out.println(per.getInfo());
    }
}
