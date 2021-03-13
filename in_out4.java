package duanyiting;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class in_out4 {
    public static void main(String[] args) throws Exception{
        File file=new File("D:"+File.separator+"hello"+File.separator+
                "aaa.txt");
        if (!file.getParentFile().exists())
        {
            file.getParentFile().mkdirs();
        }
        OutputStream output=new FileOutputStream(file);
        String str="duanyiting";
        output.write(str.getBytes());
        output.close();
    }
}
