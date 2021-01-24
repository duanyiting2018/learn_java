package duanyiting;
import java.io.File;
public class in_out3 {
    public static void main(String[] args) {
        File file=new File("c:"+File.separator);
        if (file.isDirectory())
        {
            File result[]=file.listFiles();
            for (int x=0;x<result.length;x++)
            {
                System.out.println(result[x]);
            }
        }
    }
}
