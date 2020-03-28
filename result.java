package duanyiting;

public class result {
    public static void main(String[] args) {
        int resultA=sum(13,25);
        int resultB=sum(13,25,37);
        double resultC=sum(13.4,25.7);
        double resultD=sum(13.2,25.3,37.1);
        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);
        System.out.println(resultD);
    }
    public static int sum(int x,int y)
    {
        return x+y;
    }
    public static int sum(int x,int y,int z)
    {
        return x+y+z;
    }
    public static double sum(double x,double y)
    {
        return x+y;
    }
    public static double sum(double x,double y,double z)
    {
        return x+y+z;
    }
}
