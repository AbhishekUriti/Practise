package Arrays1;

public class max_subarray {
    public static void main(String[] args) {
        int[] nums={-2,-5,6,-2,-3,1,5,-6};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums){
        int max_so_far=nums[0];
        int cur_so_far=nums[0];
        for(int i=1;i<nums.length;i++){
            cur_so_far=Math.max(nums[i],nums[i]+cur_so_far);
            max_so_far=Math.max(cur_so_far,max_so_far);
        }
        return max_so_far;
    }
}
