//引用传递
package duanyiting;

class Person4
{
    String name;
    int age;
    public void say()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }
}

public class class_demo4 {
    public static void main(String[] args) {
        Person4 person1=new Person4();
        person1.name="张三";
        person1.age=18;
        Person4 person2=person1;
        person2.age=22;
        person1.say();
    }
}
