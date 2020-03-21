package duanyiting;

public class string_stringbuilder_time {
    public static void main(String[] args) {
        String str="";
        //定义字符串操作起始时间
        long start_time=System.currentTimeMillis();
        //操作
        for(int i=0;i<=10000;i++)
        {
            str=str+1;
        }
        long end_time=System.currentTimeMillis();
        long time=end_time-start_time;//定义操作的时间
        System.out.println("Sting消耗时间："+time+" "+start_time);
        StringBuilder builder=new StringBuilder("");//创建字符串生成器
        start_time=System.currentTimeMillis();
        for(int j=0;j<=10000;j++)
        {
            builder.append(j);
        }
        end_time=System.currentTimeMillis();
        time=end_time-start_time;
        System.out.println("Stringbuilder消耗时间："+time);
    }
}
