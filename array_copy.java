package duanyiting;

class ArrayUtil5
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
public class array_copy {
    public static void main(String[] args) {
        int dataA[]=new int[]{24,13,61,44,39,22,11,85};
        int dataB[]=new int[]{15,7,66,17,20,42};
        System.arraycopy(dataA,4,dataB,1,4);
        ArrayUtil5.printArray(dataA);
        ArrayUtil5.printArray(dataB);
    }
}
