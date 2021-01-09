package duanyiting;

public class often_class9 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        String str="";
        for (int x=0;x<30000;x++)
        {
            str+=x;
        }
        long end=System.currentTimeMillis();
        System.out.println("花费的时间:"+(end-start)+"ms");
    }
}
