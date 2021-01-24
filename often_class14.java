package duanyiting;
import java.util.Arrays;
public class often_class14 {
    public static void main(String[] args) {
        int data[]=new int[] {1,3,4,6,7,8,10,30,66,98};
        Arrays.sort(data);
        System.out.println(Arrays.binarySearch(data,7));
        System.out.println(Arrays.binarySearch(data,15));
    }
}
