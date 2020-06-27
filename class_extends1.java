package duanyiting;

class Person__4
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Student1 extends Person__4
{

}
public class class_extends1 {
    public static void main(String[] args) {
        Student1 Student1=new Student1();
        Student1.setName("张三");
        Student1.setAge(19);
        System.out.println("姓名:"+Student1.getName()+" "+"年龄:"+Student1.getAge());
    }
}
