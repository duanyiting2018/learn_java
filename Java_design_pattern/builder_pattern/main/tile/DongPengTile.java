package builder_pattern.main.tile;

import builder_pattern.main.Matter;

import java.math.BigDecimal;

public class DongPengTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "东鹏瓷砖";
    }

    @Override
    public String model() {
        return "A10001#";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }

    @Override
    public String desc() {
        return "东鹏瓷砖以品质成就品牌、以科技推动品牌。2014年品牌价值132.35亿元，位列陶瓷行业之首";
    }
}
