package abstract_factory.main.factory;

import abstract_factory.main.ICacheAdapter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKProxyFactory {
    public static <T> T getProxy(Class cacheClazz, Class<? extends ICacheAdapter>cacheAdapter)
            throws Exception{
        InvocationHandler handler=new JDKInvocationHandler(cacheAdapter.getDeclaredConstructor().newInstance());
        ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
        return (T) Proxy.newProxyInstance(classLoader,new Class[]{cacheClazz},handler);
    }
}
