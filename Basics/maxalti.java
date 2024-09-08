package Basics;

public class maxalti {
    public static void main(String[] args) {
        int[] nums={-5,1,5,0,-7};
        int current_alt=0;
        int max_alt=0;
        for (int arr:nums){
            current_alt+=arr;
            if(current_alt>max_alt)
                max_alt=current_alt;
        }
        System.out.println(max_alt);
        System.out.println(longestContinuous(new int[]{1,0,0,1,0,1,1,1,1,0}));
    }
    static int longestContinuous(int[] arr){
        int count=0;
        int max=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count+=1;
                max=Math.max(max,count);
            }else {
                count=0;
            }
        }
        return max;
    }
}
