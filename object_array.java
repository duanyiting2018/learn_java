package duanyiting;

class Person_g
{
    private String name;
    private int age;
    public Person_g(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getInfo()
    {
        return "姓名："+this.name+" "+"年龄："+this.age;
    }
}
public class object_array {
    public static void main(String[] args) {
        Person_g person[]=new Person_g[3];
        person[0]=new Person_g("张三",20);
        person[1]=new Person_g("李四",11);
        person[2]=new Person_g("王五",23);
        for(int i=0;i<person.length;i++)
        {
            System.out.println(person[i].getInfo());
        }
    }
}
