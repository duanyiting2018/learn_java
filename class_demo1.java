package duanyiting;

class Person1
{
    String name;
    int age;
    public void say()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }
}
public class class_demo1 {
    public static void main(String[] args) {
        Person1 person1=new Person1();
        person1.name="张三";
        person1.age=22;
        person1.say();
        person1.name="李四";
        person1.age=17;
        person1.say();
        person1.name="王五";
        person1.age=14;
        person1.say();
    }

}
