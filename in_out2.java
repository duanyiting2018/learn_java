package duanyiting;
import java.io.File;
public class in_out2 {
    public static void main(String[] args) throws Exception{
        File file=new File("d:"+File.separator+"hello"+
                File.separator+"demo"+File.separator+"message"+
                File.separator+"duanyiting.txt");
        if (!file.getParentFile().exists())
        {
            System.out.printf("父目录不存在，是否创建新目录？"+"否");
            System.out.println("\n好的");
        }
        if (file.exists())
        {
            file.delete();
        }
        else
        {
            System.out.println("操作失败，没有找到原文件");
        }
    }
}
