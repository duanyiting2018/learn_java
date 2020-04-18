package duanyiting;

class ArrayUtil3
{
    public static void reverse(int[] data3)
    {
        int center=data3.length/2;
        int head=0;
        int tail=data3.length-1;
        for(int i=0;i<center;i++)
        {
            int temp=data3[head];
            data3[head]=data3[tail];
            data3[tail]=temp;
            head++;
            tail--;
        }
    }
    public static void printArray(int[] temp)
    {
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
}
public class array_turn {
    public static void main(String[] args) {
        int data1[]=new int[]{1,2,3,4,5,6,7,8,9,10,50,100};
        ArrayUtil3.reverse(data1);
        ArrayUtil3.printArray(data1);
    }
}

//------------注意,两个代码不能放在一起运行!!!-------------------
//二维数组转置
package duanyiting;

class ArrayUtil4
{
    public static void reverse(int temp[][])
    {
        for(int i=0;i<temp.length;i++) {
            for (int j = i; j < temp[i].length; j++) {
                int t = temp[i][j];
                temp[i][j] = temp[j][i];
                temp[j][i] = t;
            }
        }
    }
    public static void printArray(int temp[][])
    {
        for(int i=0;i<temp.length;i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
public class array_turn {
    public static void main(String[] args) {
        int data2[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,50,100}};
        ArrayUtil4.printArray(data2);
        System.out.println();
        ArrayUtil4.reverse(data2);
        ArrayUtil4.printArray(data2);
    }
}
