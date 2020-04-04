package duanyiting;

class Person9
{
    private String name;
    private int age;
    public Person9()
    {
        name="无名氏";
        age=0;
    }
    public Person9(String tempName)
    {
        name=tempName;
    }
    public Person9(int tempAge)
    {
        age=tempAge;
    }
    public Person9(String tempName,int tempAge)
    {
        name=tempName;
        age=tempAge;
    }
    public void say()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }

}
public class class_demo9 {
    public static void main(String[] args) {
        Person9 person;
        person=new Person9();
        person.say();
        person=new Person9("张三");
        person.say();
        //person=new Person9(null);     <-这个语句加不加都可以
        person=new Person9(18);
        person.say();
        person=new Person9("张三",18);
        person.say();
    }
}
