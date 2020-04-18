package duanyiting;

public class array_and_class {
    public static void main(String[] args) {
        int data[]=new int[]{1,2,3};
        printArray(data);
    }
    public static void printArray(int temp[])
    {
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
    }
}
