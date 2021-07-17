package builder_pattern.main.tile;

import builder_pattern.main.Matter;

import java.math.BigDecimal;

public class MarcoPoloTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗";
    }

    @Override
    public String model() {
        return "Lv.2";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(186);
    }

    @Override
    public String desc() {
        return "马可波罗品牌诞生于1996年，作为国内最早品牌化的建陶品牌，以“文化陶瓷”占领市场，有“仿古砖至尊”的美誉";
    }
}
