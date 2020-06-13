package duanyiting;

class Person__5
{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class School extends Person__5
{
    private String man;
    private String woman;

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getWoman() {
        return woman;
    }

    public void setWoman(String woman) {
        this.woman = woman;
    }
}
public class class_extends2 {
    public static void main(String[] args) {
        School school=new School();
        school.setMan("张三");
        school.setAge(22);
        System.out.println("姓名:"+school.getMan()+" "+"年龄:"+school.getAge());
        school.setWoman("李四");
        school.setAge(18);
        System.out.println("姓名:"+school.getWoman()+" "+"年龄:"+school.getWoman());

    }
}
