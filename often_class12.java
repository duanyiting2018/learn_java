package duanyiting;
/**
 * 本类主要是进行数学计算,并且提供的都是static方法,没有提供属性
 * @author duanyiting
 */
class MathUtil
{
    private MathUtil() {};
    /**
     * 进行准确四舍五入操作
     * @param num 要进行四舍五入的数字
     * @param scale 保留的小数位
     * @return 四舍五入处理后的结果
     */
    public static double round(double num,int scale)
    {
        return Math.round(num*Math.pow(10.0,scale)) / Math.pow(10.0,scale);
    }
}
public class often_class12 {
    public static void main(String[] args) {
        System.out.println(MathUtil.round(3.141592653589793238466433832795028841971,10));
    }
}
