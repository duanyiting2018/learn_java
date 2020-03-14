package duanyiting;

import java.util.Date;
public class date {
    public static void main(String[] args) {
        Date date1=new Date();
        String date2=String.format("%tF",date1);
        System.out.println("现在是："+date2);
        Date date3=new Date();
        String date4=String.format("%tR",date3);
        System.out.println(date4);
    }
}
