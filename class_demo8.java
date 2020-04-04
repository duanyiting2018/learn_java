package duanyiting;

class Person8
{
    private String name;
    private int age;
    public Person8(String tempName,int tempAge)
    {
        name=tempName;
        age=tempAge;
    }
    public void say()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }
}
public class class_demo8 {
    public static void main(String[] args) {
        Person8 person=new Person8("张三",47);
        person.say();
    }
}
