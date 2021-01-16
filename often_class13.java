package duanyiting;
import java.util.Random;
public class often_class13 {
    public static void main(String[] args) {
        int data[]=new int [8];
        Random rand=new Random();
        int foot=0;
        while(foot<8)
        {
            int num=rand.nextInt(51);
            if(isUse(num,data))
            {
                data[foot++]=num;
            }
        }
        java.util.Arrays.sort(data);
        printArray(data);
    }
    /**
     * 将接收到整型数组内容进行输出
     * @param temp 数组临时变量
     */
    public static void printArray(int temp[])
    {
        for (int x=0;x<temp.length;x++)
        {
            System.out.println(temp[x]);
        }
    }
    public static boolean isUse(int num,int temp[])
    {
        if(num==0)
        {
            return false;
        }
        for(int x=0;x<temp.length;x++)
        {
            if(num==temp[x])
            {
                return false;
            }
        }
        return true;
    }
}
