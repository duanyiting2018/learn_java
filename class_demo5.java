package duanyiting;

class Person5
{
    String name;
    int age;
    public void say()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }
}

public class class_demo5 {
    public static void main(String[] args) {
        Person5 person=new Person5();
        person.name="张三";
        person.age=17;
        change(person);//等价于Person temp=person;
        person.say();
    }
    private static void change(Person5 temp)
    {
        temp.age=33;
    }
}
