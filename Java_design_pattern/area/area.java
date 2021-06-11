package Java_design_pattern.area;

import Java_design_pattern.area.impl.CalculationArea;

public class area {
    public static void main(String[] args) {
        CalculationArea area=new CalculationArea();
        System.out.println(area.rectangle(3.2,5.1));
        System.out.println(area.triangle(3,4,5));
        System.out.println(area.circular(10.1));
    }
}
