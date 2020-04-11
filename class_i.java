package duanyiting;

class Dept
{
    private long deptyear;
    private String deptname;
    private String deptwhere;
    public Dept()
    {

    }
    public Dept(long deptyear,String deptname,String deptwhere)
    {
        this.deptyear=deptyear;
        this.deptname=deptname;
        this.deptwhere=deptwhere;
    }
    public String getInfo()
    {
        return "   【公司信息】   \n公司起始时间："+
                this.deptyear+
                "年"+
                "\n公司名称："+
            this.deptname+
                "\n公司位置："+this.deptwhere;
    }
}
public class class_i {
    public static void main(String[] args) {
        Dept dept=new Dept(2013,"乐乐生产文具有限公司","中国河北");
        System.out.println(dept.getInfo());
    }
}
