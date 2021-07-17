package builder_pattern.main.ceilling;

import builder_pattern.main.Matter;

import java.math.BigDecimal;

public class LevelTwoCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(785);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶，一般往下吊20cm，如果层高很高，则可以增加每次的厚度";
    }
}
