package duanyiting;

public class often_class10 {
    public static void main(String[] args) throws Exception {
        Member memberA=new Member("DUANYITNG",11);
        Member memberB=(Member)memberA.clone();
        memberB.setName("段亦庭");
        System.out.println(memberA);
        System.out.println(memberB);
    }
}
class Member implements Cloneable
{
    private String name;
    private int age;
    public Member(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "["+super.toString()+"] name="+this.name+",age="+this.age;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
