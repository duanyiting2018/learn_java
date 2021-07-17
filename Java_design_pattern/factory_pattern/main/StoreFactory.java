package factory_pattern.main;

import factory_pattern.main.impl.coupon.CouponCommodityService;
import factory_pattern.main.impl.goods.GoodsCommodityService;
import factory_pattern.main.impl.card.IQiYiCommodityService;

import java.lang.reflect.InvocationTargetException;

public class StoreFactory {
    /**
     * 奖品类型方式实例化
     * @param commodityType 奖品类型
     * @return 实例化对象
     */
    public ICommodity getCommodityService(Integer commodityType){
        if (null==commodityType) return null;
        switch (commodityType) {
            case 1:
                return new CouponCommodityService();
            case 2:
                return new GoodsCommodityService();
            case 3:
                return new IQiYiCommodityService();
        }
        throw new RuntimeException("不存在的奖品服务类型");
    }
    /**
     *奖品类信息方式实例化
     * @param clazz 奖品类型
     * @return 实例化对象
     */
    public ICommodity getCommodityService(Class<? extends ICommodity> clazz)
            throws IllegalAccessException, InstantiationException,
            NoSuchMethodException, InvocationTargetException {
            if(null==clazz) return null;
            return clazz.getConstructor().newInstance();
    }
}
