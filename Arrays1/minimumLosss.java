package Arrays1;

import java.util.*;

public class minimumLosss {
    static int Loss(List<Long> prices){
        Map<Long,Integer>hm=new HashMap<>();
        for(int i=0;i<prices.size();i++){
            hm.put(prices.get(i),i);
        }
        Collections.sort(prices);
        long minimumLoss=Long.MAX_VALUE;
        for(int i=prices.size()-1;i>0;i--){
            if(hm.get(prices.get(i))>hm.get(prices.get(i-1)))
                continue;
            long dayLoss=prices.get(i)-prices.get(i-1);
            minimumLoss=Math.min(dayLoss,minimumLoss);
        }
        return (int) minimumLoss;
    }
}
