package duanyiting;

class Dept2
{
    private long deptno;
    private String deptname;
    private String loc;
    private Emp2 emps[];

    public Dept2(long deptno,String deptname,String loc)
    {
        this.deptno=deptno;
        this.deptname=deptname;
        this.loc=loc;
    }
    public Emp2[] getEmps() {
        return this.emps;
    }

    public void setEmps(Emp2[] emps) {
        this.emps = emps;
    }
    public String getInfo()
    {
        return "【部门信息】部门编号="+this.deptno
                +" 部门名称="+this.deptname
                +" 部门位置="+this.loc;
    }
}
class Emp2
{
    private long empno;
    private String empname;
    private String job;
    private double sal;
    private double comm;
    private Dept2 dept;
    private Emp2 mgr;
    public Emp2(long empno,String empname,String job,double sal,double comm)
    {
        this.empno=empno;
        this.empname=empname;
        this.job=job;
        this.sal=sal;
        this.comm=comm;
    }
    public String getInfo()
    {
        return "【雇员信息】编号="+this.empno
                +" 姓名="+this.empname
                +" 职位="+this.job
                +" 工资="+this.sal
                +" 佣金="+this.comm;
    }

    public Dept2 getDept() {
        return this.dept;
    }

    public void setDept(Dept2 dept) {
        this.dept = dept;
    }

    public Emp2 getMgr() {
        return this.mgr;
    }

    public void setMgr(Emp2 mgr) {
        this.mgr = mgr;
    }
}
public class array_class3 {
    public static void main(String[] args) {
        Dept2 dept=new Dept2(10,"教学部","上海");
        Emp2 empA=new Emp2(3368L,"张三","清洁",227.38,73.30);
        Emp2 empB=new Emp2(2715L,"李四","教师",351.55,135.81);
        Emp2 empC=new Emp2(6431L,"王五","校长",6485.93,386.97);
        empA.setDept(dept);
        empB.setDept(dept);
        empC.setDept(dept);
        empA.setMgr(empB);
        empB.setMgr(empC);
        dept.setEmps(new Emp2[]{empA,empB,empC});
        System.out.println(dept.getInfo());
        for(int i=0;i<dept.getEmps().length;i++)
        {
            System.out.println("\t|-"+dept.getEmps()[i].getInfo());
            if(dept.getEmps()[i].getMgr()!=null)
            {
                System.out.println("\t\t|-"+dept.getEmps()[i].getMgr().getInfo());
            }
        }
        System.out.println("--------------------");
        System.out.println(empB.getDept().getInfo());
        System.out.println(empB.getMgr().getInfo());
    }
}
