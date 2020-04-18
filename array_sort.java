package duanyiting;

class ArrayUtil2
{
    public static void sort(int data[])
    {
        for(int i=0;i<data.length;i++)
        {
            for(int j=0;j<data.length-i-1;j++)//-i是因为可以减少循环次数,降低时间复杂度
            {
                if(data[j]>data[j+1])
                {
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int temp[])
    {
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
}
public class array_sort {
    public static void main(String[] args) {
        int data[]=new int[]{8,4,2,7,5,9,10,3,6,1};
        ArrayUtil2.sort(data);
        ArrayUtil2.printArray(data);
    }
}
