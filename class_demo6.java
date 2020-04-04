package duanyiting;

class Person6
{
    String name;
    int age;
    public void say()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }
}

public class class_demo6 {
    public static void main(String[] args) {
        Person5 person1=new Person5();
        Person5 person2=new Person5();
        person1.name="张三";
        person1.age=24;
        person2.name="李四";
        person2.age=31;
        person2=person1;
        person2.age=83;
        person1.say();
    }
}
