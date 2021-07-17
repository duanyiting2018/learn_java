package dip.impl;

import dip.IDraw;

import java.util.ArrayList;
import java.util.List;

public class DrawWeightRank implements IDraw {
    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        list.sort((o1, o2) -> {
            int e=o2.getUserWeight()-o1.getUserWeight();
            if(e==0) return 0;
            return e>0?1:-1;
        });
        List<BetUser> prizeList=new ArrayList<>(count);
        for (int i=0;i<count;i++){
            prizeList.add(list.get(i));
        }
        return prizeList;
    }
}
