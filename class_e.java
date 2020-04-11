package duanyiting;

class Person_e
{
    private String name;
    private int age;
    public Person_e()
    {
        System.out.println("-----一个新的Person类对象实例化了-----");
    }
    public Person_e(String name)
    {
        this();
        this.name=name;
    }
    public Person_e(String name,int age)
    {
        this.age=age;
        //this(name);//构造方法调用必须放在首行
    }
    public String getInfo()
    {
        //this();//构造方法调用必须放在首行
        return "姓名："+this.name+" 年龄："+this.age;
    }
}
