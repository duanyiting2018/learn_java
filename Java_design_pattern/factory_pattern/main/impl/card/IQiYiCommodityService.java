package factory_pattern.main.impl.card;

import factory_pattern.main.ICommodity;

import java.util.Map;

public class IQiYiCommodityService implements ICommodity {
    private IQiYiCardService iQiYiCardService=new IQiYiCardService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId,
                              Map<String, String> extMap) throws Exception {
        String mobile=queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile,bizId);
        System.out.println("请求参数[爱奇艺兑换卡]=>uId:"+uId+" commodityId:"+commodityId+
                " bizId:"+bizId+ " extMap:"+extMap);
        System.out.println("测试结果[爱奇艺兑换卡]:success");
    }
    private String queryUserMobile(String uId){
        return "15204031226";
    }
}
