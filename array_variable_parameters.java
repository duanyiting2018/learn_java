package duanyiting;

class ArrayUtil6
{
    public static int sum(int ... data)
    {
        int sum=0;
        for(int i=0;i<data.length;i++)
        {
            sum+=data[i];
        }
        return sum;
    }
}
public class array_variable_parameters {
    public static void main(String[] args) {
        System.out.println(ArrayUtil6.sum(1,2,3));
        System.out.println(ArrayUtil6.sum(new int[]{1,2,3}));
    }
}
