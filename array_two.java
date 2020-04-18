package duanyiting;

public class array_two {
    public static void main(String[] args) {
        int data[][]=new int[][]{{1,46,77,4,35},{1,48,9},{35,44,21,7}};
        for(int i=0;i<data.length;i++)//循环数组行
        {
            for(int j=0;j<data[i].length;j++)//循环数组列
            {
                System.out.println("data["+i+"]["+j+"]="+data[i][j]);
            }
            System.out.println();
        }

    }
}
