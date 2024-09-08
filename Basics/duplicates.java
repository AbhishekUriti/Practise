package Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class duplicates {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] arr={5,4,10,9,21,10,90,80,80,80,90};
        for(int num:arr){
            int freq=map.getOrDefault(num,0);
            map.put(num,++freq);
        }
        List<Integer> duplicates=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1)
                duplicates.add(entry.getKey());
        }
        for (int i:duplicates){
            System.out.print(i+" ");
        }
    }
}
