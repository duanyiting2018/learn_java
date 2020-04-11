package duanyiting;

class Person_f
{
    private String name;
    private int age;
    public Person_f()
    {
        //this("ueriqe",37);//Error:(7, 12) java: 递归构造器调用
       System.out.println("-----一个新的Person类对象实例化了-----");
    }
    public Person_f(String name)//Error:(7, 12) java: 递归构造器调用
    {
        this();
        this.name=name;
    }
    public Person_f(String name,int age)//Error:(7, 12) java: 递归构造器调用
    {
        this(name);
        this.age=age;
    }
    public String getInfo()
    {
        return "姓名："+this.name+" 年龄："+this.age;
    }
}
