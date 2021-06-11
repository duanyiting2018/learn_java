package Java_design_pattern.lsp.impl;

import Java_design_pattern.lsp.BankCard;

import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class CashCard extends BankCard {
    private Logger logger = LoggerFactory.getLogger(BankCard.class);

    public CashCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    public boolean rule(BigDecimal amount) {
        return true;
    }
    /*
     提现
     @param orderId 单号
     @param amount 金额
     @return 状态码 0000成功，0001失败，0002重复
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        logger.info("提现成功，单号：{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);
    }
    public String recharge(String orderId, BigDecimal amount) {
        logger.info("储蓄成功，单号：{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    public boolean checkRisk(String orderId, String cardNo, BigDecimal amount) {
        logger.info("风险校验，卡号 {} 单号:{} 金额:{}", cardNo, orderId, amount);
        return true;
    }
}