package dip;

import com.alibaba.fastjson.JSON;
import dip.impl.BetUser;
import dip.impl.DrawControl;
import dip.impl.DrawRandom;
import dip.impl.DrawWeightRank;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
public class dip{
    @Test
    public void test_DrawControl(){
        List<BetUser> betUserList=new ArrayList<>();
        betUserList.add(new BetUser("小花",65));
        betUserList.add(new BetUser("豆豆",43));
        betUserList.add(new BetUser("小白",72));
        betUserList.add(new BetUser("帅逼",52));
        betUserList.add(new BetUser("帅比",56));
        DrawControl drawControl=new DrawControl();
        List<BetUser> prizeRandomUserList=
                drawControl.doDraw(new DrawRandom(),betUserList,3);
        System.out.println("随机抽奖，中奖用户名单："+JSON.toJSON(prizeRandomUserList));
        List<BetUser> prizeWeightUserList=
                drawControl.doDraw(new DrawWeightRank(),betUserList,3);
        System.out.println("权重抽奖，中奖用户名单："+JSON.toJSON(prizeWeightUserList));
    }
}
