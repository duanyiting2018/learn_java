package duanyiting;

public class return_array {
    public static void main(String[] args) {
        int data[]=initArray();
        printArray(data);
    }
    public static int[] initArray()
    {
        int arr[]=new int[]{13,22,47};
        return arr;
    }
    public static void printArray(int temp[])
    {
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
    }
}
