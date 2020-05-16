package duanyiting;

public class string_toCharArray {
    public static void main(String[] args) {
        String str="duanyitingjava";
        char[] result=str.toCharArray();
        for(int i=0;i<result.length;i++)
        {
            result[i]-=32;
        }
        String newStr=new String(result);
        System.out.println(newStr);
        System.out.println(new String(result,0,10));
    }
}
