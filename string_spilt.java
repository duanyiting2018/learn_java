package duanyiting;

public class string_spilt {
    public static void main(String[] args) {
        String str="mldn,java,yootk,duanyiting,dyt";
        String result[]=str.split(",");
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
