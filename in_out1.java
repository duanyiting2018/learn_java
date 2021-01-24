package duanyiting;
import java.io.File;
public class in_out1 {
    public static void main(String[] args) throws Exception{
        File file=new File("F:\\duanyiting2018_GitHub\\" +
                "learn_java\\src\\main\\java\\duanyiting\\附件\\1.txt");
        if (file.exists())
        {
            file.delete();
        }
        else
        {
            System.out.println(file.createNewFile());
        }
    }
}
