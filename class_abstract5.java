package duanyiting;

class Int
{
    private int data;
    public Int(int data)
    {
        this.data=data;
    }
    public int intValue()
    {
        return this.data;
    }
}
public class class_abstract5 {
    public static void main(String[] args) {
        Object obj=new Int(12);
        int x=((Int)obj).intValue();
        System.out.println(x+238);
    }
}
