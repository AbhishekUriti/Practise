package Arrays1;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class missingNumbers {
    public static void main(String[] args) {
        int[] arr={7,2,5,4,6,3,5,3};
        int[] brr={7,2,5,3,5,3};
        System.out.println(Arrays.toString(missingNumber(arr, brr)));
    }
    static int[] missingNumber(int[] arr,int[] brr){
       TreeMap<Integer,Integer> treeMap=new TreeMap<>();
       for(int i:arr){
           treeMap.put(i,treeMap.getOrDefault(i,0)+1);
       }
       for(int i:brr){
           int freq=treeMap.get(i);
           freq--;
           if(freq==0)
               treeMap.remove(i);
           else
               treeMap.put(i,freq);
       }
       int result[]=new int[treeMap.size()];
       int idx=0;
       for(Map.Entry<Integer,Integer> entry:treeMap.entrySet()){
           result[idx++]=entry.getKey();
       }
       return result;
    }

}
