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
class Student extends Person__4
{

}
public class class_extends1 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("张三");
        student.setAge(19);
        System.out.println("姓名:"+student.getName()+" "+"年龄:"+student.getAge());
    }
}
