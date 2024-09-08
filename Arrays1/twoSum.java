package Arrays1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int[] nums={16,4,23,8,15,42,1,2};
        int target=19;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(hm.containsKey(complement)) {
                return new int[]{hm.get(complement), i};
            }
            hm.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum found Solution");
    }
}
