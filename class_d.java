package duanyiting;

class Person_d
{
    private String name;
    private int age;
    public Person_d()
    {
        System.out.println("-----一个新的Person类对象实例化了-----");
    }
    public Person_d(String name)
    {
        this();
        this.name=name;
    }
    public Person_d(String name,int age)
    {
        this(name);
        this.age=age;
    }
    public void say()
    {
        System.out.println("姓名："+this.name+" 年龄："+this.age);
    }
}
public class class_d {
    public static void main(String[] args) {
        Person_d person=new Person_d("张三",12);
        person.say();
    }
}
