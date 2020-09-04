package duanyiting;

enum Sex
{
    MALE("男"),FEMALE("女");
    private String title;
    private Sex(String title)
    {
        this.title=title;
    }
    @Override
    public String toString()
    {
        return this.title;
    }
}
class Person10
{
    private String name;
    private int age;
    private Sex sex;
    public Person10(String name,int age,Sex sex)
    {
        this.age=age;
        this.name=name;
        this.sex=sex;
    }
    public String toString()
    {
        return "姓名:"+this.name+" 年龄:"+
        this.age+" 性别:"+this.sex;
    }
}
public class class_package14 {
    public static void main(String[] args) {
        System.out.println(new Person10("蔡徐坤",18,Sex.FEMALE));//hhhh
    }
}
