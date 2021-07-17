package builder_pattern.main.floor;

import builder_pattern.main.Matter;

import java.math.BigDecimal;

public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔(Der)";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(237);
    }

    @Override
    public String desc() {
        return "德尔集团是专业地板制造商，北京2008奥运会家装地板供应商";
    }
}
