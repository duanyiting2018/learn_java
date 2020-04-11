package duanyiting;

class Message
{
    private String info;
    public Message(String tempInfo)
    {
        info=tempInfo;
    }
    public String getInfo()
    {
        return info;
    }
    public void setInfo(String info)
    {
        this.info=info;
    }
}
class Person_a
{
    private String name;
    private int age;
    public Person_a(Message msg,int tempAge)//定义双参数构造方法
    {
        name=msg.getInfo();
        age=tempAge;
    }
    public Message getMessage()
    {
        return new Message("姓名："+name+" 年龄："+age);
    }
    public void say()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }
}
public class class_a {
    public static void main(String[] args) {
        Person_a person=new Person_a(new Message("张三"),12);//实例化Person_a类对象
        person.say();
        Message msg=person.getMessage();//获得Message对象
        System.out.println(msg.getInfo());
    }
}
