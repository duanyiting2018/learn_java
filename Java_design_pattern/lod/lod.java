package lod;

import lod.impl.Principal;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import java.util.Map;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
public class lod {
    @Test
    public void test_Principal(){
        //Logger logger = LoggerFactory.getLogger(lod.class);
        JSONObject JSON= new JSONObject();
        Principal principal=new Principal();
        Map<String,Object> map=principal.queryClazzInfo("4年6班");
        //logger.info("查询结果：{}",JSON.toJSONString(map));
        System.out.println(JSON.toJSONString(map));
    }
}
