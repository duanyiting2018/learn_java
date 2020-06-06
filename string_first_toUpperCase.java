package duanyiting;

class first_toUpperCase
{
    /**
     * 首字母大写,其它字母不变
     * @param str 要处理的字符串
     * @return 首字母大写处理后的结果
     */
    public static String initCap(String str)
    {
        if(str==null||"".equals(str))
        {
            return str;//如果是空字符串就原样返回
        }
        if(str.length()==1)
        {
            return str.toUpperCase();//如果是字符直接大写
        }
        return str.substring(0,1).toUpperCase()+str.substring(1);//否则取首字符并大写再连接后面的字符串
    }
}
public class string_first_toUpperCase {
    public static void main(String[] args) {
        System.out.println(first_toUpperCase.initCap("duanyiting"));
        System.out.println(first_toUpperCase.initCap("c"));
        System.out.println(first_toUpperCase.initCap("")+"标识符");
    }
}
