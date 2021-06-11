package Java_design_pattern.lsp;

import Java_design_pattern.lsp.impl.CashCard;

import java.math.BigDecimal;

public class lsp {
    public static void main(String[] args) {
        CashCard cashcard=new CashCard("8732792348","2020-10-10");
        cashcard.withdrawal("10001",new BigDecimal(100));
        cashcard.recharge("10001",new BigDecimal(100));
    }
}
