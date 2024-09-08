package Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class uniqueElements {
    public static void main(String[] args) {
        System.out.println(uniqueElements(new int[]{5,4,10,9,21,4,10}));
    }
    static List<Integer> uniqueElements(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            int freq=map.getOrDefault(num,0);
            map.put(num,++freq);
        }
        List<Integer> result=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
