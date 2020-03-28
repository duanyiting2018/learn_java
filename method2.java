package duanyiting;

public class method2 {
    public static void main(String[] args) {
        String result=payAndGet(20.3);
        System.out.println(result);//输出操作结果
        System.out.println(payAndGet(8.6));//也可以直接输出操作结果
    }
    public static String payAndGet(double money)
    {
        if(money>=10.0)
        {
            return "购买一份10元的套餐，找零："+(money-10.0);
        }
        else
        {
            return "对不起，余额不足，请充值";
        }
    }
}
