package abstract_factory.test;

import abstract_factory.main.workshop.impl.IIRCacheAdapter;
import org.junit.Test;
import abstract_factory.main.factory.JDKProxyFactory;
import abstract_factory.main.workshop.impl.EGMCacheAdapter;
import abstract_factory.main.application.CacheService;

public class abstractFactory_test {
    @Test
    public void test()throws Exception{
        CacheService proxy_EGM=JDKProxyFactory.getProxy(CacheService.class, EGMCacheAdapter.class);
        proxy_EGM.set("user_name1","段智华");
        String val1=proxy_EGM.get("user_name1");
        System.out.println("缓存EGM测试，proxy_EGM.get 测试结果："+val1);
        CacheService proxy_IIR=JDKProxyFactory.getProxy(CacheService.class, IIRCacheAdapter.class);
        proxy_IIR.set("user_name2","段亦庭");
        String val2=proxy_IIR.get("user_name2");
        System.out.println("缓存IIR测试，proxy_IIR.get 测试结果："+val2);
    }
}
