package duanyiting;

class Person3
{
    String name;
    int age;
    public void say()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }
}

public class class_demo3 {
    public static void main(String[] args) {
        Person3 person=null;//没有实例化所以会报NullPointerException错误
        person.name="张三";
        person.age=24;
        person.say();
    }
}
