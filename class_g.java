package duanyiting;

class Emp
{
    private long empno;
    private String empname;
    private String dept;
    private double salary;
    public Emp()
    {
        this(1000,"无名氏",null,0.0);
    }
    public Emp(long empno)
    {
        this(empno,"新员工","未定",0.0);
    }
    public Emp(long empno,String empname,String dept)
    {
        this(empno,empname,dept,3500.0);
    }
    public Emp(long empno,String empname,String dept,double salary)
    {
        this.empno=empno;
        this.empname=empname;
        this.dept=dept;
        this.salary=salary;
    }
    public String getInfo()
    {
        return "雇员编号："+
                this.empno+
                "\n雇员姓名："+
                this.empname+
                "\n所在部门："+
                this.dept+
                "\n月薪："+
                this.salary;
    }
}
public class class_g {
    public static void main(String[] args) {
        Emp emp=new Emp(7421L,
                "史密斯",
                "电力部",
                3800.0);
        System.out.println(emp.getInfo());
    }
}
