package builder_pattern.main.floor;

import builder_pattern.main.Matter;

import java.math.BigDecimal;

public class ShengXiangFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣象";
    }

    @Override
    public String model() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    @Override
    public String desc() {
        return "圣象地板是中国地板行业著名品牌，拥有中国驰名品牌等多项荣誉";
    }
}