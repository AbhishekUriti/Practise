package Arrays1;

import java.util.HashMap;
import java.util.Map;

public class StringFreqency {
    public static void main(String[] args) {
        String str="aaabbbddddfffffe";
        strfreq(str);
    }
    static void strfreq(String str){
        Map<Character,Integer> hm=new HashMap<>();
        for(char c:str.toCharArray()){
           hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for(Character key:hm.keySet()){
            System.out.print(key+""+hm.get(key));
        }
    }
}
