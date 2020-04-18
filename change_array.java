package duanyiting;

public class change_array {
    public static void main(String[] args) {
        int data[]=new int[]{42,33,9,25};
        printArray(data);
        System.out.println();
        changeArray(data);
        printArray(data);
    }
    public static void changeArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]*=2;
        }
    }
    public static void printArray(int temp[])
    {
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
    }
}
