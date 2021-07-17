package factory_pattern.test;

import factory_pattern.main.ICommodity;
import factory_pattern.main.StoreFactory;
import factory_pattern.main.impl.coupon.CouponCommodityService;
import org.junit.Test;

import java.util.HashMap;

public class Factory_test {
    @Test
    public void test_StoreFactory_1() throws Exception{
        StoreFactory storeFactory=new StoreFactory();
        //coupon
        ICommodity commodityService_1=storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001",
                "EGM2579348032048295728920654200245601","8659925407625248",null);
        //goods
        ICommodity commodityService_2=storeFactory.getCommodityService(2);
        commodityService_2.sendCommodity("10001","938467254938",
                "8394755348074357302574528486746",new HashMap<String,String>(){{
                    put("consigneeUserName","段先生");
                    put("consigneeUserPhone","15204031226");
                    put("consigneeUserAddress","上海市静安区xx路xx小区4#231号");
                }});
        //card
        ICommodity commodityService_3=storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001","JSOEUIOCMcnoenmCOEJNvhoJOjeocCOXW",
                null,null);
    }
    @Test
    public void test_StoreFactory_2() throws Exception{
        StoreFactory storeFactory=new StoreFactory();
        ICommodity commodityService=
                storeFactory.getCommodityService(CouponCommodityService.class);
        commodityService.sendCommodity("10001",
                "EGM2579348032048295728920654200245601","8659925407625248",null);
    }
}
