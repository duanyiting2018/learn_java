package Java_design_pattern.lsp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public abstract class BankCard{
    private Logger logger=Logger.getLogger(String.valueOf(BankCard.class));
    private String cardNo;
    private String cardDate;
    public BankCard(String cardNo, String cardDate) {
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }
    public abstract boolean rule(BigDecimal amount);
    public String positive(String orderId,BigDecimal amount){
        //logger.info("卡号 {} 入款成功,单号:{},金额:{}",cardNo,orderId,amount);
        logger.info("卡号 入款成功,单号:,金额:");

        return "0000";
    }
    public String negative(String orderId,BigDecimal amount){
        //logger.info("卡号 {} 出款成功,单号:{},金额:{}",cardNo,orderId,amount);
        logger.info("卡号 入款成功,单号:,金额:");
        return "0000";
    }
    /*
    交易流水查询
    @return 交易流水
     */
    public List<String> tradeFlow(){
        logger.info("交易流水查询成功！");
        List<String> tradeList=new ArrayList<String>();
        tradeList.add("10001,100.00");
        tradeList.add("10001,113.20");
        tradeList.add("10001,74.37");
        tradeList.add("10001,85.20");
        return tradeList;
    }
    public String getCardNo() {
        return cardNo;
    }

    public String getCardDate() {
        return cardDate;
    }
}
