package duanyiting;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    public static int sum(int num)
    {
        if(num==1)
        {
            return factorial(1);
        }
        return factorial(num)+sum(num-1);
    }
    public static int factorial(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num*factorial(num-1);
    }

}
