package factory_pattern.main.impl.coupon;

import com.alibaba.fastjson.JSON;
import factory_pattern.main.ICommodity;
import java.util.Map;

public class CouponCommodityService implements ICommodity {
    private CouponService couponService=new CouponService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap)
            throws Exception {
        CouponResult couponResult=couponService.sendCoupon(uId,commodityId,bizId);
        System.out.println("请求参数[优惠券]=>uId:"+uId+" commodityId:"+commodityId+
                " bizId:"+bizId+" extMap:"+extMap);
        System.out.println("测试结果[优惠券]:"+ JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())){
            throw new RuntimeException(couponResult.getInfo());
        }
    }
}
