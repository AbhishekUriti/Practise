package Basics;

import java.util.HashMap;
import java.util.Map;

public class Gauntlets {
    public static void main(String[] args) {
        int[] nums={4,1,7,4,1,4};
        Map<Integer,Integer> map=new HashMap<>();
        for (int num:nums){
            int freq=map.getOrDefault(num,0);
            map.put(num,++freq);
        }
        int totalPairs=0;
        for (int count:map.values()){
            totalPairs+=count/2;
        }
        System.out.println(totalPairs);
    }
}
