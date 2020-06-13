package duanyiting;
class Person__7
{
    private String name;
    private int age;
    public Person__7(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
class Student4 extends Person__7
{
    private String school;
    public Student4(String name,int age,String school)
    {
        super(name, age);
        this.school=school;
    }
}
public class class_extends4 {
    public static void main(String[] args) {
        Student4 student=new Student4("张三",20,"清华大学");
    }
}
