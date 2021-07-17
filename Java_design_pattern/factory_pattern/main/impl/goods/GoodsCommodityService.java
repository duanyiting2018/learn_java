package factory_pattern.main.impl.goods;

import com.alibaba.fastjson.JSON;
import factory_pattern.main.ICommodity;

import java.util.Map;

public class GoodsCommodityService implements ICommodity {
    private GoodsService goodsService=new GoodsService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId,
                              Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq=new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));
        Boolean isSuccess=goodsService.deliverGoods(deliverReq);
        System.out.println("请求参数[实物商品]=>uId:"+uId+" bizId:"+bizId+" extMap:"+extMap);
        System.out.println("测试结果[实物商品]:"+ JSON.toJSON(isSuccess));
        if (!isSuccess){
            throw new RuntimeException("实物商品发送失败");
        }
    }
    private String queryUserName(String uId){
        return "花花";
    }
    private String queryUserPhoneNumber(String uId){
        return "15204031226";
    }
}
