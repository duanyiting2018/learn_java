package duanyiting;

class Person__8
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Student5 extends Person__8
{
    public Student5(String name)
    {
        setName(name);
    }
    public String getInfo()
    {
        return "姓名:"+getName();
    }
}
public class class_extends5 {
    public static void main(String[] args) {
        Student5 student=new Student5("李四");
        System.out.println(student.getInfo());
    }
}
