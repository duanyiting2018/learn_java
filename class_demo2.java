package duanyiting;

class Person2
{
    String name;
    int age;
    public void say()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }
}
public class class_demo2 {
    public static void main(String[] args) {
        Person2 person2=new Person2();
        person2.say();
    }

}
