package Arrays1;

import java.util.*;

public class Singlenumber {
    public static void main(String[] args) {
        int[] nums={4, 1, 2, 1, 2,5,2};
        int[] arr={1,2,1,4,4};
        System.out.println(singleNumber(arr));
        System.out.println(findSingle(nums));
    }
    static List<Integer> findSingle(int[] nums){
        Map<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        List<Integer> result=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()==1){
                result.add(entry.getKey());
            }
        }
    return result;
    }

    static int singleNumber(int[] nums){
        int sing=nums[0];
        for(int i=1;i<nums.length;i++){
            sing=sing^nums[i];
        }
        return sing;
    }
}
