package builder_pattern.main.coat;

import builder_pattern.main.Matter;

import java.math.BigDecimal;

public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士(Dulux)";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(724);
    }

    @Override
    public String desc() {
        return "多乐士是著名装修油漆品牌，产品畅销全球100多个国家，每年全球有5000万家庭使用多乐士油漆";
    }
}
