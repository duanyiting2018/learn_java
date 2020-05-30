package duanyiting;

public class string_split4 {
    public static void main(String[] args) {
        String str="张三:20|李四:18|王五:22";
        String result[]=str.split("\\|");
        for(int i=0;i<result.length;i++)
        {
            String temp[]=result[i].split(":");
            System.out.println("姓名："+temp[0]+" "+"年龄："+temp[1]);
        }
    }
}
