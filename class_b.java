package duanyiting;

class Person_b
{
    private String name;
    private int age;
    public Person_b(String name,int age)
    {
        this.name=name;//使用this标注Person_b类属性
        this.age=age;
    }
    public void say()
    {
        System.out.println("姓名："+this.name+" 年龄："+this.age);
    }
}
public class class_b {
    public static void main(String[] args) {
        Person_b person=new Person_b("张三",37);
        person.say();
    }
}
