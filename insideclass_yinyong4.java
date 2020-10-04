package duanyiting;

class Person11
{
    private String name;
    private int age;
    public Person11(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString() {
        return "姓名:" + this.name + " 年龄:" + this.age;
    }
}
@FunctionalInterface
interface IFunction4<R>
{
    public R create(String s,int a);
}
public class insideclass_yinyong4 {
    public static void main(String[] args) {
        IFunction4<Person11> fun=Person11::new;
        //调用create()就等介于调用new Person11(),所以必须传入两个参数
        System.out.println(fun.create("张三",19));
    }
}
