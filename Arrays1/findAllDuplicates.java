package Arrays1;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicates {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1,1};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums){
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                result.add(index+1);
            }
            nums[index]*=-1;
        }
        return result;
    }
}
