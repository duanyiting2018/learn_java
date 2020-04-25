package duanyiting;

class ArrayUtil4
{
    public static void printArray(int temp[])
    {
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
}
public class array_sort2 {
    public static void main(String[] args) {
        int data[]=new int[]{24,13,61,44,39,22,11,85};
        java.util.Arrays.sort(data);
        ArrayUtil4.printArray(data);
    }
}
