package builder_pattern.main;

import java.math.BigDecimal;

public interface Matter {
    String scene();//场景
    String brand();//品牌
    String model();//型号
    BigDecimal price();//价格
    String desc();//描述
}
