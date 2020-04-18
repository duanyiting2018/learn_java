package duanyiting;

class ArrayUitl1
{
    private int sum;
    private double avg;
    private int max;
    private int min;
    ArrayUitl1(int data[])
    {
        this.max=data[0];//假设第一个是最大值&最小值
        this.min=data[0];
        for(int i=0;i<data.length;i++)
        {
            if(data[i]>max)
            {
                this.max=data[i];
            }
            if(data[i]<min)
            {
                this.min=data[i];
            }
            this.sum+=data[i];//数据累加
        }
        this.avg=this.sum/data.length;//统计平均值
    }
    public int getSum() {
        return this.sum;
    }

    public double getAvg() {
        return this.avg;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }
}
public class array {
    public static void main(String[] args) {
        int data[]=new int[]{15,37,11,29,3};
        ArrayUitl1 uitl=new ArrayUitl1(data);//数据计算
        System.out.println("sum:"+uitl.getSum());
        System.out.println("avg:"+uitl.getAvg());
        System.out.println("max:"+uitl.getMax());
        System.out.println("min:"+uitl.getMin());
    }
}
