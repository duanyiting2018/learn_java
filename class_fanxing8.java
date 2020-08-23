package duanyiting;

public class class_fanxing8 {
    public static void main(String[] args) {
        Integer num[]=fun(1,2,3,4,5);
        for (int temp:num)
        {
            System.out.println(temp);
        }
    }
    public static <T> T[] fun(T... args)
    {
        return args;
    }
}
