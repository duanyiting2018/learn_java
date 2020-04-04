//用private封装
package duanyiting;

class Person7
{
    private String name;
    private int age;
    public void say()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }
    public void setName(String tempname)
    {
        name=tempname;
    }
    public void setAge(int tempage)
    {
        if(tempage>0&&tempage<100)
        {
            age=tempage;
        }
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class class_demo7 {
    public static void main(String[] args) {
        Person7 person=new Person7();
        person.setName("张三");
        person.setAge(-18);
        person.setAge(36);
        person.say();
    }
}
