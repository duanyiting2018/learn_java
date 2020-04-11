package duanyiting;

class Person_c
{
    private String name;
    private int age;

    //public String getName() {
    //    return name;
    //}

    public void setName(String name) {
        this.name = name;
    }

    //public int getAge() {
    //    return age;
    //}

    public void setAge(int age) {
        this.age = age;
    }

    public Person_c(String name, int age)
    {
        this.setName(name);
        setAge(age);//不使用this也可以调用此方法
    }
    public void say()
    {
        System.out.println("姓名："+this.name+" 年龄："+this.age);
    }
}
public class class_c {
    public static void main(String[] args) {
        Person_c person=new Person_c("张三",21);
        person.say();
    }
}
