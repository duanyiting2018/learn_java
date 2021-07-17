package builder_pattern.main.coat;

import builder_pattern.main.Matter;

import java.math.BigDecimal;

public class LiBangCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦";
    }

    @Override
    public String model() {
        return "默认级别";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(621);
    }

    @Override
    public String desc() {
        return "立邦始终开发绿色产品，无毒无害，注重高科技、高品质，满足消费者的需求";
    }
}
