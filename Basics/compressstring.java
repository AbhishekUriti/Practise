package Basics;

import java.util.HashMap;
import java.util.Map;

public class compressstring {
    public static void main(String[] args) {
        String str="aaabbbbhhheaaAsssssss";
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int freq=map.getOrDefault(c,0);
            map.put(c,++freq);
        }
        StringBuilder result=new StringBuilder();
        for (Character key:map.keySet()){
            result.append(key).append(map.get(key));
        }
        System.out.print(result);
    }
}
