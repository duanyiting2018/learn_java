package duanyiting;

class Chinese1
{
    private String name;
    private int age;
    static String country="中华人民共和国";//静态成员属性，暂时不封装
    public Chinese1(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getInfo()
    {
        return "姓名："+this.name+" 年龄："+this.age+" 国家："+this.country;
    }
}
public class class_j {
    public static void main(String[] args) {
        Chinese1 perA=new Chinese1("张三",11);
        Chinese1 perB=new Chinese1("李四",25);
        Chinese1 perC=new Chinese1("王五",32);
        perA.country="中国";//修改静态属性内容
        System.out.println(perA.getInfo());
        System.out.println(perB.getInfo());
        System.out.println(perC.getInfo());
    }
}
