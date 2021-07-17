package abstract_factory.main.redis;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class RedisUtils {
    private Map<String,String> dataMap=new ConcurrentHashMap<String,String>();
    public String get(String key){
        System.out.println("EGM获取数据 key: "+key);
        return dataMap.get(key);
    }
    public void set(String key,String value){
        System.out.println("EGM写入数据 key: "+key+" value: "+value);
        dataMap.put(key,value);
    }
    public void set(String key, String value, long timeout, TimeUnit timeUnit){
        System.out.println("EGM写入数据 key: "+key+" value: "+value+" timeout: "+timeout+
                " timeUnit: "+timeUnit.toString());
        dataMap.put(key, value);
    }
    public void del(String key){
        System.out.println("EGM删除数据 key: "+key);
        dataMap.remove(key);
    }
}
